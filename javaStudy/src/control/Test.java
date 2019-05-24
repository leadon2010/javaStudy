package control;

public class Test {
	public static void main(String[] args) {

		System.out.println("");
		boolean bool;
		bool = false;
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i == j)
					bool = !bool;

				if (bool)
					System.out.print("*");
				else
					System.out.print(" ");

				if (i + j == 10)
					bool = !bool;
			}
			System.out.println();
		}
	}
}
