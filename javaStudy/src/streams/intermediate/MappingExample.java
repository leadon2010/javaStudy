package streams.intermediate;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MappingExample {
	public static void main(String[] args) {

		// flatMap example
		Stream.of(1, 2, 3).flatMap(new Function<Integer, Stream<Integer>>() {
			@Override
			public Stream<Integer> apply(Integer t) {
				return Stream.of(t, t * 2);
			}
		}).forEach(System.out::println);
		System.out.println("---------------------------------------");

		Stream.of(1, 3, 5).flatMapToInt(new Function<Integer, IntStream>() {
			@Override
			public IntStream apply(Integer t) {
				return IntStream.of(t, t + 1, t * 10);
			}
		}).forEach(s -> System.out.print(s + "\t"));
		System.out.println();
		System.out.println("---------------------------------------");

		double sum = Stream.of(1, 5, 9).flatMapToDouble(new Function<Integer, DoubleStream>() {
			@Override
			public DoubleStream apply(Integer t) {
				return DoubleStream.of(t);
			}
		}).sum();
		System.out.println(sum);
		System.out.println("---------------------------------------");

		// Map Example

//		IntStream.rangeClosed(1, 5).map(opr -> opr * 2).forEach(System.out::println);

		Employee.employees().stream().flatMapToDouble(new Function<Employee, DoubleStream>() {
			@Override
			public DoubleStream apply(Employee t) {
				return DoubleStream.of(t.getIncome());
			}
		}).forEach(System.out::println);
		System.out.println("---------------------------------------");

		Employee.employees().stream().map(Employee::getName).forEach(System.out::println);
		System.out.println("---------------------------------------");

		// map example
		Employee.employees().stream().map(Employee::toString).forEach(System.out::println);
		System.out.println("---------------------------------------");

	}
}
