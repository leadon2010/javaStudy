package stream.mapping;

import java.util.stream.IntStream;

public class OptionalExample {
	public static void main(String[] args) {
		double result = IntStream.rangeClosed(1, 5).filter(n -> n % 2 == 0).average().orElse(0.0);
		System.out.println(result);
		System.out.println("===============");

		IntStream.rangeClosed(1, 5).filter(n -> n % 6 == 0).findAny().ifPresent(s -> System.out.println(s));
		System.out.println("===============");
	}
}
