package method;

public class BankAccount {
	String accNumber;
	String ssNumber;
	int balance = 0;

	public BankAccount(String accNumber, String ssNumber, int balance) {
		this.accNumber = accNumber;
		this.ssNumber = ssNumber;
		this.balance = balance;
	}

	int deposit(int amt) {
		balance += amt;
		return balance;
	}

	int withdraw(int amt) {
		balance -= amt;
		return balance;
	}

	int checkMyBalance() {
		System.out.println("계좌번호: " + accNumber);
		System.out.println("주민번호: " + ssNumber);
		System.out.println("잔액: " + balance);
		return balance;
	}

}
