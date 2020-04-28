package basic;

public class ForExample {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("sum: " + sum);

		for (int i = 1, j = 0; i <= 5; i++) {
			for (j = 0; j < i; j++)
				System.out.print("*");
			System.out.println();
		}
	}

}
