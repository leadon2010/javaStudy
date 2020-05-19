package exceptions.exam;

public class LoginExample {
	public static void main(String[] args) {
		try {
			login("blues", "12345");
		} catch (NotExistIdException | WrongPasswordException e) {
			System.out.println(e.getMessage());
//			e.printStackTrace();
		}
		try {
			login("blue", "1235");
		} catch (NotExistIdException | WrongPasswordException e) {
			System.out.println(e.getMessage());
//			e.printStackTrace();
		}
	}

	public static void login(String id, String passwd) throws NotExistIdException, WrongPasswordException {
		if (!id.equals("blue")) {
			throw new NotExistIdException("존재하지 않는 아이디입니다");
		}

		if (!passwd.equals("12345")) {
			throw new WrongPasswordException("비밀번호를 확인하세요");
		}

		System.out.println("반갑습니다.");
	}
}
