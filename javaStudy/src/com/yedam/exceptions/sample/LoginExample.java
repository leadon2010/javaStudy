package com.yedam.exceptions.sample;

@SuppressWarnings("serial")
class NotExistIDException extends Exception {
	public NotExistIDException() {
	}

	public NotExistIDException(String message) throws NotExistIDException {
		super(message + "는 존재하지 않는 아이디입니다.");
	}
}

@SuppressWarnings("serial")
class WrongPasswdException extends Exception {
	public WrongPasswdException() {
	}

	public WrongPasswdException(String message) throws WrongPasswdException {
		super(message + "는 잘못된 비번입니다.");
	}
}

public class LoginExample {
	public static void main(String[] args) {
		try {
			login("white", "12345");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			login("blue", "54321");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void login(String id, String pw) throws NotExistIDException, WrongPasswdException {
		if (!id.equals("blue")) {
			throw new NotExistIDException(id);
		}
		if (!pw.equals("12345")) {
			throw new WrongPasswdException(pw);
		}
	}
}
