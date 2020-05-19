package exceptions;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		account.deposit(1000);

		try {
			account.withdraw(2000);
		} catch (BalanceInsuffientException e) {
			System.out.println(e.getMessage());
			System.out.println();
//			e.printStackTrace();
		}

		System.out.println("end of prog.");
	}
}
