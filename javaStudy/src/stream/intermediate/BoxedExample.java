package stream.intermediate;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BoxedExample {
	public static void main(String[] args) {
		IntStream is = IntStream.of(1, 2, 3, 4, 5, 6);
		Stream<Integer> stream = is.boxed();
		stream.forEach(System.out::println);
	}
}
