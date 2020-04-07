package stream.mapping;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class AggregateExample {
	public static void main(String[] args) {
		
		IntStream intStream = Arrays.stream(new int[] { 1, 2, 3, 4, 5 });
		long cnt = IntStream.rangeClosed(1, 100).filter(i -> i % 2 == 0).count();
		System.out.println("Cnt: " + cnt);

		int sum = intStream.filter(n -> n % 2 == 0).sum();
		System.out.printf("Sum: %5d", sum);
		System.out.println();

		OptionalDouble dbl = IntStream.rangeClosed(1, 5).filter(n -> n % 2 == 0).average();
		if (dbl.isPresent())
			System.out.println(dbl.getAsDouble());
		else
			System.out.println("no container.");

	}
}
