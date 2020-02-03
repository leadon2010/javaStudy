package thisisjava.exception;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		String data = null;
		try {
			System.out.println(data.toString());
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println("객체잠조 에러.");
		}
		System.out.println("프로그램 종료.");
	}
}
