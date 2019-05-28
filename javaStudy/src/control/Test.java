package control;

public class Test {
	public static void main(String[] args) {
		gugudan(3, 5);
	}

	public static void gugudan(int a) {
		System.out.println(a + "단 입니다.");
		for (int i = 1; i <= 9; i++) {
			System.out.println(a + " * " + i + " = " + (a * i));
		}
	}

	public static void gugudan(int a, int b) {
		System.out.println("구구단입니다.");
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				if (j == a || j == b) {
					System.out.print(j + " * " + i + " = " + (j * i) + "\t");
				}
			}
			System.out.println();
		}
	}
}