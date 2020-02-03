package thisisjava.exception;

class Account {
	private long balance;

	public Account() {
	}

	public long getBalance() {
		return balance;
	}

	public void deposit(int money) {
		balance += money;
	}

	public void withdraw(int money) throws BalanceInsufficientException {
		if (balance < money)
			throw new BalanceInsufficientException("잔고부족:" + (money - balance) + " 모자람");
		balance -= money;
	}
}

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		account.deposit(10000);
		System.out.println("예금액: " + account.getBalance());
		try {
			account.withdraw(30000);
		} catch (BalanceInsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			e.printStackTrace();
		}

		System.out.println("프로그램 종료.");
	}
}
