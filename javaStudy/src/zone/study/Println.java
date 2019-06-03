package zone.study;

public class Println {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		println(3, "*", 30);
		System.out.println("프로그램 종료");
	}

	static void println(int a, String str, int length) {
		String toStr = "";
		for (int i = 0; i < length; i++) {
			toStr += str;
		}
		for (int i = 0; i < a; i++)
			System.out.println(toStr);
	}

}
