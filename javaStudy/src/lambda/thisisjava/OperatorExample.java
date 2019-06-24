package lambda.thisisjava;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	private static int[] scores = { 92, 95, 87 };

	public static int minOrMax(IntBinaryOperator operator) {
		int result = scores[0];

		for (int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}

	public static void main(String[] args) {
		int result = minOrMax((a, b) -> {
			if (a >= b)
				return a;
			else
				return b;
		});
		System.out.println("max value: " + result);

		result = minOrMax((a, b) -> {
			if (a >= b)
				return b;
			else
				return a;
		});
		System.out.println("min value: " + result);
	}
}
