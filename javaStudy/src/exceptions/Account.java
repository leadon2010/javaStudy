package exceptions;

public class Account {
	private long balance;

	public long getBalance() {
		return balance;
	}

	public void deposit(int money) {
		balance += money;
	}

	public void withdraw(int money) throws BalanceInsuffientException {
		if (balance < money) {
			throw new BalanceInsuffientException("잔고부족 " + (money - balance) + " 모자랍니다. ");
		}
		balance -= money;
	}
}
