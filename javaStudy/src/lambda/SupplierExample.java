package lambda;

import java.util.function.IntSupplier;

public class SupplierExample {
	public static void main(String[] args) {
		IntSupplier intSupplier = () -> {
			int num = (int) (Math.random() * 6 + 1);
			return num;
		};
		for (int i = 0; i < 10; i++)
			System.out.println(intSupplier.getAsInt());
	}
}
