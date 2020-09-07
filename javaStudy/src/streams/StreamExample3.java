package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample3 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("Hong", 90), new Student("Park", 88), new Student("Choi", 80),
				new Student("Kwon", 87));

		Stream<Student> streams = list.stream();
		Double result = streams.mapToInt(new ToIntFunction<Student>() {
			@Override
			public int applyAsInt(Student value) {
				System.out.println(value.name + ", " + value.score);
				return value.score;
			}

		}).average().getAsDouble();
		System.out.println(" 결과: " + result);

		streams = list.stream();
		result = streams.flatMapToInt(new Function<Student, IntStream>() {
			@Override
			public IntStream apply(Student t) {
				System.out.println(t.name + ", " + t.score);
				return IntStream.of(t.score);
			}

		}).average().getAsDouble();
		System.out.println(" 결과: " + result);
	}
}
