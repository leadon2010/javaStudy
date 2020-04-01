package lambda;

import java.util.Scanner;
import java.util.function.IntBinaryOperator;

public class OperatorExample {
	private static int[] scores = { 92, 95, 87 };

	public static int minOrMax(IntBinaryOperator oper) {
//		int r = scores[0];
//		for (Integer i : scores) {
//			r = oper.applyAsInt(i, r);
//		}
		Scanner scn = new Scanner(System.in);
		System.out.println("input 2 values:");
		int a = scn.nextInt();
		int b = scn.nextInt();
		return oper.applyAsInt(a, b);
	}

	public static void main(String[] args) {
		int result = minOrMax((a, b) -> {
			if (a >= b) {
				return a;
			} else {
				return b;
			}
		});
		System.out.println("Biggest Value: " + result);

		result = minOrMax((a, b) -> {
			if (a > b) {
				return b;
			} else {
				return a;
			}
		});
		System.out.println("Smallest Value: " + result);
	}
}
