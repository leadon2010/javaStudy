package lambda;

import java.util.function.IntBinaryOperator;

public class OperatorExample {

	static int[] scores = { 92, 95, 87 };

	public static int minOrMaxOrSum(IntBinaryOperator operator) {
		int result = scores[0];
		for (int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}

	public static void main(String[] args) {
		IntBinaryOperator operator = (left, right) -> (left > right ? left : right);
		System.out.println(operator.applyAsInt(3, 4));

		int result = minOrMaxOrSum((left, right) -> (left > right ? left : right));
		System.out.println(result);

		result = minOrMaxOrSum((left, right) -> left + right);
		System.out.println(result);

	}
}
