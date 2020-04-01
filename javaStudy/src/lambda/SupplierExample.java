package lambda;

import java.util.Scanner;
import java.util.function.BooleanSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class SupplierExample {
	public static void main(String[] args) {

		Supplier<String> strSupplier = () -> {
			return "Hello, World";
		};
		System.out.println(strSupplier.get());

		BooleanSupplier boolSup = () -> {
			Scanner scn = new Scanner(System.in);
			System.out.println("값을 입력하세요.");
			int inputValue = scn.nextInt();
			if (inputValue > 10) {
				return true;
			} else {
				return false;
			}
		};
		if (boolSup.getAsBoolean()) {
			System.out.println("10보다 큰수 입력.");
		} else {
			System.out.println("10보다 작은 수 입력.");
		}

		IntSupplier intSupplier = () -> {
			int num = (int) (Math.random() * 6 + 1);
			return num;
		};
		for (int i = 0; i < 10; i++)
			System.out.println(intSupplier.getAsInt());

		LongSupplier longSupplier = () -> {
			long result = 45 * 234;
			return result;
		};
		System.out.println(longSupplier.getAsLong());

	}
}
