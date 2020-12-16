package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

import echo.EchoServer;

public class ChatClient {
	private static final String SERVER_IP = "127.0.0.1";
	public static void main(String[] args) {
		Socket socket = null;
		Scanner scanner = null;
		
		try {
			socket = new Socket();
			scanner = new Scanner(System.in);
			
			socket.connect(new InetSocketAddress(SERVER_IP, EchoServer.PORT));
			
			PrintWriter pw = new PrintWriter((new OutputStreamWriter(socket.getOutputStream(), "UTF-8")));
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
			
			System.out.print("닉네임?");
			String nickname = scanner.nextLine();
			pw.println("JOIN:" + nickname);
			pw.flush();
			
			Thread chatClientThread = new ChatClientThread(br);
			chatClientThread.start();
			
			while(true) {
				String input = scanner.nextLine();
				
				if("exit".equals(input) || "EXIT".equals(input)) {
					pw.println("EXIT:" + nickname);
					pw.flush();
					break;
				} else {
					pw.println("MESG:" + input);
					pw.flush();
				}
			}
		} catch (IOException e) {
			System.out.println("[client] error:" + e);
		} finally {
			try {
				if(socket != null && !socket.isClosed()) {
					socket.close();
				}		
				if(scanner != null) {
					scanner.close();
				}
			} catch (IOException e) {
				System.out.println("[client] error:" + e);
			}
		}
	}
}
