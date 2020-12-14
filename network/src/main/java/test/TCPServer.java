package test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;

public class TCPServer {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			//1. 서버소켓 생성
			serverSocket = new ServerSocket();
			
			//2. 바인딩(binding) : Socket Address(IP Address + Port)
			serverSocket.bind(new InetSocketAddress("127.0.0.1", 5000));
			
			
			//3. accept
			serverSocket.accept(); //blocking
			
			System.out.println("accept");
			
		} catch (IOException e) {
			System.out.print("[server] error:" + e);
		} finally {
			try {
				if(serverSocket != null && serverSocket.isClosed())
				serverSocket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
