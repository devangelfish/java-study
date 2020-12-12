package prob5;

public class Account {
	String accountNo;
	int balance;

	public String getAccNo() {
		return accountNo;
	}

	public Account(String accountNo) {
		this.accountNo = accountNo;
		this.balance = 0;
	}

	public void setAccNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void withdraw(int amount) {
		this.balance -= amount;
	}

	public void deposit(int amount) {
		this.balance += amount;
	}
}
