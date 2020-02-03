package thisisjava.lambda;

import java.util.function.IntSupplier;

public class LambdaProblem4 {

	public static int method(int x, int y) {
		IntSupplier supplier = () -> {
			// x *= 10; // final 변경 불가.
			int result = x + y;
			return result;

		};
		int result = supplier.getAsInt();
		return result;
	}

	public static void main(String[] args) {
		System.out.println(method(4, 5));
	}
}
