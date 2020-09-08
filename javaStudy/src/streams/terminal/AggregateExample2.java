package streams.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

import streams.intermediate.Student;

public class AggregateExample2 {
	public static void main(String[] args) {

		List<Student> students = Arrays.asList(new Student("Hong", 92), new Student("Hwang", 88),
				new Student("Park", 90));

		// 1) sum()
		int sum1 = students.stream().mapToInt(new ToIntFunction<Student>() {
			@Override
			public int applyAsInt(Student value) {
				return value.getScore();
			}
		}).sum();
		System.out.println("sum1: " + sum1);
		System.out.println();

		// 2) reduce()
		int sum2 = students.stream().map(new Function<Student, Integer>() {
			@Override
			public Integer apply(Student t) {
				return t.getScore();
			}
		}).reduce(new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer t, Integer u) {
				System.out.println("t: " + t + " , u: " + u);
				return t + u;
			}
		}).get();
		System.out.println("sum2: " + sum2);
		System.out.println();

		// 3) reduce(identity, comparator)
		int sum3 = students.stream().flatMap(new Function<Student, Stream<Integer>>() {
			@Override
			public Stream<Integer> apply(Student t) {
				return Stream.of(t.getScore());
			}
		}).reduce(0, new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer t, Integer u) {
				System.out.println("t: " + t + " , u: " + u);
				return t + u;
			}
		});
		System.out.println("sum3: " + sum3);
		System.out.println();

		// 4) reduce() => max 값 가져오기.
		double sum4 = students.stream().mapToDouble(new ToDoubleFunction<Student>() {
			@Override
			public double applyAsDouble(Student value) {
				return value.getScore();
			}

		}).reduce(0.0, new DoubleBinaryOperator() {
			@Override
			public double applyAsDouble(double left, double right) {
				return left > right ? left : right;
			}
		});
		System.out.println("sum4: " + sum4);
		System.out.println();

		// 5) reduce()
		int sum5 = students.stream().reduce(new Integer(0), new BiFunction<Integer, Student, Integer>() {

			@Override
			public Integer apply(Integer t, Student u) {
				return t + u.getScore();
			}
		}, new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t, Integer u) {
				return t + u;
			}
		});
		System.out.println("sum5: " + sum5);
		System.out.println();

	}
}
