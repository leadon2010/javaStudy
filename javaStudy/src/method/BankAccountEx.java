package method;

public class BankAccountEx {
	public static void main(String[] args) {
		BankAccount bank1 = new BankAccount("123-456", "990101-123456789", 10000);
		BankAccount bank2 = new BankAccount("123-567", "980101-123456789", 10000);

		bank1.deposit(10000);
		bank1.checkMyBalance();
		bank1.withdraw(3000);
		bank1.checkMyBalance();

		bank2.deposit(5000);
		bank2.checkMyBalance();
		bank2.withdraw(3000);
		bank2.checkMyBalance();

		check(bank1);
	}

	static void check(BankAccount bnk) {
		bnk.checkMyBalance();
	}
}
