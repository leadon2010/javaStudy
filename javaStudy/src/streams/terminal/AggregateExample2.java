package streams.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

import streams.intermediate.Student;

public class AggregateExample2 {
	public static void main(String[] args) {

		List<Student> students = Arrays.asList(new Student("Hong", 92), new Student("Hwang", 88),
				new Student("Park", 90));

		int sum1 = students.stream().mapToInt(new ToIntFunction<Student>() {
			@Override
			public int applyAsInt(Student value) {
				return value.getScore();
			}
		}).sum();
		System.out.println("sum1: " + sum1);

		int sum2 = students.stream().map(new Function<Student, Integer>() {
			@Override
			public Integer apply(Student t) {
				return t.getScore();
			}
		}).reduce(new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer t, Integer u) {
				return t + u;
			}
		}).get();
		System.out.println("sum2: " + sum2);

		int sum3 = students.stream().flatMap(new Function<Student, Stream<Integer>>() {
			@Override
			public Stream<Integer> apply(Student t) {
				return Stream.of(t.getScore());
			}
		}).reduce(0, new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer t, Integer u) {
				return t + u;
			}
		});
		System.out.println("sum3: " + sum3);

	}
}
