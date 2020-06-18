package streams.intermediate;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MappingExample2 {

	public static void main(String[] args) {

		Stream.of("XML", "Java", "CSS").flatMap(new Function<String, Stream<Character>>() {
			@Override
			public Stream<Character> apply(String t) {
				return IntStream.range(0, t.length()).mapToObj(new IntFunction<Character>() {
					@Override
					public Character apply(int value) {
						return t.charAt(value);
					}
				});
			}
		}).forEach(new Consumer<Character>() {
			@Override
			public void accept(Character t) {
				System.out.println(t);
			}
		});
		System.out.println("======================================");

		// map example
		Stream.of("Hong", "Hwang", "Park").map(new Function<String, IntStream>() {
			@Override
			public IntStream apply(String t) {
				return t.chars();
			}
		}).flatMap(new Function<IntStream, Stream<Character>>() {
			@Override
			public Stream<Character> apply(IntStream t) {
				return t.mapToObj(new IntFunction<Character>() {
					@Override
					public Character apply(int value) {
						return (char) value;
					}
				});
			}
		}).forEach(System.out::println);

		Stream.of("Hong", "Hwang", "Park").flatMap(name -> IntStream.range(0, name.length()).mapToObj(name::charAt))
				.forEach(new Consumer<Character>() {
					@Override
					public void accept(Character t) {
						System.out.println(t);
					}
				});
		System.out.println("======================================");

//				"Hello".chars().forEach(System.out::println);
	}
}
