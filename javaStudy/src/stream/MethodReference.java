package stream;

import java.util.function.IntBinaryOperator;

class Calculator {
	static int staticSum(int a, int b) {
		return a + b;
	}

	int instanceSum(int x, int y) {
		return x + y;
	}
}

public class MethodReference {
	public static void main(String[] args) {
		IntBinaryOperator iob;
		iob = (x, y) -> {
			return Calculator.staticSum(x, y);
		};

		iob = Calculator::staticSum;
		System.out.println("static: " + iob.applyAsInt(10, 20));

		Calculator c = new Calculator();
		iob = (x, y) -> {
			return c.instanceSum(x, y);
		};
		iob = c::instanceSum;
		System.out.println("instance: " + iob.applyAsInt(20, 30));
	}
}
