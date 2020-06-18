package streams.lambdas;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.UnaryOperator;

public class OperatorExample {
	private static int[] scores = { 92, 97, 85 };

	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for (int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}

	public static void main(String[] args) {

		int max = maxOrMin(new IntBinaryOperator() {
			@Override
			public int applyAsInt(int left, int right) {
				return (left > right ? left : right);
			}
		});
		System.out.println("최대값: " + max);

		int min = maxOrMin(new IntBinaryOperator() {
			@Override
			public int applyAsInt(int left, int right) {
				return (left > right ? right : left);
			}
		});
		System.out.println("최소값: " + min);

		///////////////////////////////////////////////

		UnaryOperator<String> uo = new UnaryOperator<String>() {
			@Override
			public String apply(String t) {
				return t.toUpperCase();
			}
		};
		System.out.println(uo.apply("hello"));

		DoubleUnaryOperator d1 = new DoubleUnaryOperator() {
			@Override
			public double applyAsDouble(double operand) {
				return operand * 1.1;
			}
		};
		System.out.println(d1.applyAsDouble(3));

		BinaryOperator<Integer> adder = new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer t, Integer u) {
				return t + u;
			}
		};
		System.out.println(adder.apply(3, 5));

		DoubleBinaryOperator d2 = new DoubleBinaryOperator() {
			@Override
			public double applyAsDouble(double left, double right) {
				return left * right;
			}
		};
		System.out.println(d2.applyAsDouble(3.3, 4.4));

	}
}
