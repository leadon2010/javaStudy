package control;

public class Test {
	public static void main(String[] args) {

		System.out.println("");
		boolean bool;
		// 6의 배수 출력(1 ~ 100)
		// 7의 배수 출력(101 ~ 200)
		for (int i = 1; i <= 200; i++) {
			if (i % 6 == 0 && i <= 100) {
				System.out.println(i);
			} else if (i % 7 == 0 && i > 100)
				System.out.println(i);
		}

	}
}