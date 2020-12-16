package chat;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;

import echo.EchoServer;

public class ChatServer {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		LinkedList<User> userPool = new LinkedList<User>();
		
		try {
			// 1. 서버소켓 생성
			serverSocket = new ServerSocket();

			// 2. 바인딩(binding) : Socket Address(IP Address + Port)
			serverSocket.bind(new InetSocketAddress("127.0.0.1", EchoServer.PORT));

			// 3. accept
			while (true) {
				Socket socket = serverSocket.accept(); // blocking
				new ChatServerThread(socket, userPool).start();
			}
		} catch (IOException e) {
			System.out.print("[server] error:" + e);
		} finally {
			try {
				if (serverSocket != null && !serverSocket.isClosed()) {
					serverSocket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
