package exceptions;

public class BalanceInsuffientException extends Exception {

	private static final long serialVersionUID = 1L;

	public BalanceInsuffientException() {

	}

	public BalanceInsuffientException(String message) {
		super(message);
	}
}
