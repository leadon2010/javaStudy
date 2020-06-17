package stream.intermediate;

import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NoExample {
	public static void main(String[] args) {
		Stream.of("Hong", "Hwang", "Park").flatMap(new Function<String, Stream<Character>>() {
			@Override
			public Stream<Character> apply(String t) {
				return IntStream.range(0, t.length()).mapToObj(t::charAt);
			}
		}).forEach(System.out::println);
		System.out.println("----------------");

		IntStream.range(0, 10).forEach(System.out::println);

	}
}
