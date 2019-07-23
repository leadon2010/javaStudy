package thisisjava;

public class Account {
	private String accountNo;
	private String name;
	private int balance;

	public Account(String accountNo, String name, int balance) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	void deposit(int money) {
		this.balance += money;
	}

	void withdraw(int money) {
		this.balance -= money;
	}

	void checkBalance() {
		System.out.println(this.accountNo + " 계좌의 잔액은 " + this.balance + " 입니다.");
	}
}
