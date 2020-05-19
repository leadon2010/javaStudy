package exceptions.exam;

public class NotExistIdException extends Exception {
	public NotExistIdException() {

	}

	public NotExistIdException(String message) {
		super(message);
	}
}
