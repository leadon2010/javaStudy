package streams.intermediate;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BoxedExample {
	public static void main(String[] args) {
		IntStream is = IntStream.of(1, 2, 3, 4, 5, 6);
		Stream<Integer> stream = is.boxed();
		stream.forEach(System.out::println);

		DoubleStream ds = DoubleStream.of(1.0, 2.0, 3.0, 4.0, 5.0);
		Stream<Double> dStream = ds.boxed();
		long result = dStream.count();
		System.out.println("count: " + result);

	}
}
