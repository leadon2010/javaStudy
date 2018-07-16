package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
	public static int sum(Predicate<Integer> p, List<Integer> l) {
		int s = 0;
		for (int n : l) {
			if (p.test(n))
				s += n;
		}
		return s;
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 6, 8, 5, 7, 9);
		int s;
		s = sum((n) -> n % 2 == 0, list);
		System.out.println("짝수합: " + s);
		s = sum((n) -> n % 2 == 1, list);
		System.out.println("홀수합: " + s);
	}
}
