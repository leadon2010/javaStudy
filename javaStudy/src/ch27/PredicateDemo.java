package ch27;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class PredicateDemo {
	public static int sum(PredicateDemo<Integer> p, List<Integer> list) {
		int sum = 0;
		for (int i : list)
			if (p.test(i))
				sum += i;
		return sum;
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 5, 7, 9, 11, 12);
		int sum;
		sum = sum(n -> n % 2 == 0, list);
		System.out.println("짝수의 합: " + sum);
		sum = sum(n -> n % 2 == 1, list);
		System.out.println("홀수의 합: " + sum);
	}
}