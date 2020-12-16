package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.LinkedList;

public class ChatServerThread extends Thread {
	private Socket socket;
	private LinkedList<User> userPool;
	private String nickname;
	
	public ChatServerThread(Socket socket, LinkedList<User> userPool) {
		this.socket = socket;
		this.userPool = userPool;
	}

	@Override
	public void run() {
		InetSocketAddress remoteInetSocketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();

		InetAddress remoteInetAddress = remoteInetSocketAddress.getAddress();

		String remoteHostAddress = remoteInetAddress.getHostAddress();
		int remotePort = remoteInetSocketAddress.getPort();

		System.out.println("[server] connected by client[" + remoteHostAddress + ":" + remotePort + "]");
		
		BufferedReader br = null;
		PrintWriter pw = null;
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
			pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);
			
			while(true) {
				String request = br.readLine();
				if(request == null) {
					System.out.println("[server] closed by client[" + remoteHostAddress + ":" + remotePort + "]");
					break;
				}
				
				String[] tokens = request.split(":");
				
				if("JOIN".equals(tokens[0])) {
					doJoin(tokens[1], pw);
				} else if("MESG".equals(tokens[0])) {
					doMessages(tokens[1]);
				} else if("EXIT".equals(tokens[0])) {
					System.out.println("[server] \"" + tokens[1] + "\" has left");
					doExit(tokens[1]);
					break;
				} else {
					System.out.println("[server] error request:" + tokens[0]);
				}
			}
		} catch (IOException e) {
			System.out.println("[server] error:" + e);
		}
	}

	private void doExit(String nickname) {
		synchronized (userPool) {
			for (int i = 0; i < userPool.size(); i++) {
				User user = userPool.get(i);
				if(nickname.equals(user.getName())) {
					userPool.remove(i);
				}
			}
			broadcast(nickname + "님이 퇴장하셨습니다.");
		}
	}

	private void doMessages(String mesg) {
		broadcast(nickname + ":"  + mesg);
	}

	private void doJoin(String nickname, PrintWriter pw) {
		this.nickname = nickname;
		createUser(nickname, pw);
		pw.println("OK");
		pw.flush();
		broadcast(nickname + "님이 입장하셨습니다.");
	}
	
	private void createUser(String nickname, PrintWriter pw) {
		User user = new User(nickname, pw);
		synchronized(userPool) {
			userPool.add(user);
		}
	}
	
	private void broadcast(String data) {
		synchronized (userPool) {
			for (int i = 0; i < userPool.size(); i++) {
				User user = userPool.get(i);
				if (!user.getName().equals(this.nickname)) {
					PrintWriter printWriter = user.getPw();
					printWriter.println(data);
					printWriter.flush();
				}
				user.returnUser();
			}
		}
	}
}
