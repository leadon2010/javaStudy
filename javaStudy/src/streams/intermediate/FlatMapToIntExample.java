package streams.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class FlatMapToIntExample {
	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

		long cnt = intList.stream().flatMap(new Function<Integer, Stream<Double>>() {
			@Override
			public Stream<Double> apply(Integer t) {
				return Stream.
			}

		}).count();

//		List<Double> doubleList = Arrays.asList(2.3, 4.5, 6.7, 3.4, 6.9);
//		cnt = doubleList.stream().flatMap(new Function<Double, Stream<Long>>() {
//			@Override
//			public Stream<Long> apply(Double t) {
//				return Stream.of();
//			}
//
//		}).count();

	}
}
