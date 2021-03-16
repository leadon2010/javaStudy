package lambda;

import java.util.Scanner;
import java.util.function.DoubleSupplier;

public class SupplierExample2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DoubleSupplier ds = () -> {
			class Member {
				String name;
				int score;

				Member(String name, int score) {
					this.name = name;
					this.score = score;
				}

			}
			int cnt = 0;
			int total = 0;
			while (true) {
				System.out.println("input name");
				String name = scn.nextLine();
				System.out.println("input score");
				int score = scn.nextInt();
				total += score;
				if (cnt++ == 2) {
					break;
				}
			}

			return (double) total / cnt;
		};
		System.out.println(ds.getAsDouble());

		scn.close();
	}
}
