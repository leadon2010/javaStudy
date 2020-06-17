package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamExample {
	public static void main(String[] args) {

//		int[] numbers = { 2, 3, 5, 7, 11, 13 };
//		IntStream intStream = Arrays.stream(numbers);
//		intStream = intStream.limit(3);
//		intStream.forEach(new IntConsumer() {
//			@Override
//			public void accept(int value) {
//				System.out.println(value);
//			}
//		});
//		System.out.println(intStream.peek(v -> System.out.println(v)).sum());

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		int sum = 0;
		for (int n : numbers) {
			if (n % 2 == 1) {
				int square = n * n;
				sum = sum + square;
			}
		}
		System.out.println(sum);

		sum = numbers.stream().filter(n -> n % 2 == 1).map(n -> n * n).reduce(0, (a, b) -> Integer.sum(a, b));
//		Stream<Integer> intStream = numbers.stream();

		System.out.println(sum);
	}

}
