package thisisjava.lambda;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateExample {
	public static void main(String[] args) {
		IntPredicate predicateA = (a) -> {
			return a % 2 == 0;
		};
		IntPredicate predicateB = a -> a % 3 == 0;
		IntPredicate predicateAB;
		boolean result;

		predicateAB = predicateA.and(predicateB);
		result = predicateAB.test(9);
		System.out.println("9는 2와 3의 배수입니까? " + result);

		predicateAB = predicateA.or(predicateB);
		result = predicateAB.test(9);
		System.out.println("9는 2또는 3의 배수입니까? " + result);

		predicateAB = predicateA.negate();
		result = predicateAB.test(9);
		System.out.println("9는 홀수입니까? " + result);

	}
}