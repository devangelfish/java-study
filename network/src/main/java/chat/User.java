package chat;

import java.io.PrintWriter;

public class User {
	private String name;
	private PrintWriter pw;
	private boolean used;

	public User(String name, PrintWriter pw) {
		this.name = name;
		this.pw = pw;
		this.used = false;
	}

	public String getName() {
		return name;
	}

	public PrintWriter getPw() {
		used = true;
		return pw;
	}
	
	public boolean returnUser() {
		used = false;
		return used;
	}
	
	public boolean isUsed() {
		return used;
	}
}
