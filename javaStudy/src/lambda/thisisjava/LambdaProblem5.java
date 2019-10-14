package lambda.thisisjava;

import java.util.function.IntBinaryOperator;

public class LambdaProblem5 {

	private static int[] scores = { 10, 50, 3 };

	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for (int score : scores) {
			result = operator.applyAsInt(result, score);
		}

		return result;
	}

	public static void main(String[] args) {
		int max = maxOrMin((x, y) -> {
			int result = 0;
			result = (x >= y ? x : y);
			return result;
		});
		System.out.println("최대값: " + max);

		int min = maxOrMin((x, y) -> {
			int result = 0;
			result = (x >= y ? y : x);
			return result;
		});
		System.out.println("최소값: " + min);
	}
}
