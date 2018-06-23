package ch05;

public class While2Times {
	public static void main(String[] args) {
		System.out.println("=================<for>===================");
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.printf(j + "*" + i + "=" + j * i + "\t");
			}
			System.out.println();
		}

		System.out.println("===============<while>=====================");

		int i = 1;

		while (i <= 9) {
			int j = 2;
			while (j <= 9) {
				System.out.printf(j + "*" + i + "=" + j * i + "\t");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
