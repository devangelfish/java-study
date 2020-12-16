package chat.client.win;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

import chat.ChatClientThread;
import echo.EchoServer;

public class ChatWindow {

	private Frame frame;
	private Panel pannel;
	private Button buttonSend;
	private TextField textField;
	private TextArea textArea;
	private String name;
	PrintWriter pw;
	BufferedReader br;

	public ChatWindow(String name) {
		frame = new Frame(name);
		pannel = new Panel();
		buttonSend = new Button("Send");
		textField = new TextField();
		textArea = new TextArea(30, 80);
		this.name = name;
	}

	public void show() {
		// Button
		buttonSend.setBackground(Color.GRAY);
		buttonSend.setForeground(Color.WHITE);
		buttonSend.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				sendMessage();
			}
		});

		// Textfield
		textField.setColumns(80);
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				char keyCode = e.getKeyChar();
				if (keyCode == KeyEvent.VK_ENTER) {
					sendMessage();
				}
			}
		});

		// Pannel
		pannel.setBackground(Color.LIGHT_GRAY);
		pannel.add(textField);
		pannel.add(buttonSend);
		frame.add(BorderLayout.SOUTH, pannel);

		// TextArea
		textArea.setEditable(false);
		frame.add(BorderLayout.CENTER, textArea);

		// Frame
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				
				// 채팅방 나오는 프로토콜
				pw.println("EXIT:" + name);
				pw.flush();
				System.exit(0);
			}
		});
		frame.setVisible(true);
		frame.pack();

		Socket socket = null;
		Scanner scanner = null;

		try {
			socket = new Socket();
			scanner = new Scanner(System.in);

			socket.connect(new InetSocketAddress(ChatClientApp.SERVER_IP, EchoServer.PORT));

			pw = new PrintWriter((new OutputStreamWriter(socket.getOutputStream(), "UTF-8")));
			br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));

			pw.println("JOIN:" + name);
			pw.flush();

			Thread chatClientThread = new ChatClientThread(br);
			chatClientThread.start();
			
			
			while(true) {
				if(!chatClientThread.isAlive()) {
					break;
				}
			}
		} catch (IOException e) {
			System.out.println("[client] error:" + e);
		} finally {
			try {
				if (socket != null && !socket.isClosed()) {
					socket.close();
				}
				if (scanner != null) {
					scanner.close();
				}
			} catch (IOException e) {
				System.out.println("[client] error:" + e);
			}
		}
	}

	private void sendMessage() {
		// 소켓을 통해서 전송
		String input = textField.getText();
		textField.setText("");
		textField.requestFocus();

		pw.println("MESG:" + input);
		pw.flush();
		
		textArea.append(name + ":" + input);
		textArea.append("\n");
	}

	public class ChatClientThread extends Thread {
		BufferedReader br;

		public ChatClientThread(BufferedReader br) {
			this.br = br;
		}

		@Override
		public void run() {

			while (true) {
				String data = null;
				try {
					data = br.readLine();

					if ("OK".equals(data)) {
						textArea.append("[client] connnect complete");
						textArea.append("\n");
					}

					textArea.append(data);
					textArea.append("\n");
				} catch (IOException e) {
					System.out.println("\r\n[client] closed by client");
				}
			}
		}
	}
}
