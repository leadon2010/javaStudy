package lambda;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	static int[] scores = { 92, 95, 87 };

	static int maxOrMin(IntBinaryOperator oper) {
		int result = scores[0];
		for (Integer score : scores) {
			result = oper.applyAsInt(result, score);
		}
		return result;
	}

	public static void main(String[] args) {
		int result = maxOrMin((a, b) -> {
			if (a >= b) {
				return a;
			} else {
				return b;
			}
		});
		System.out.println("큰값은: " + result);
	} // end of main

}