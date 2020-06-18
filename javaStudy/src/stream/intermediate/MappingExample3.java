package stream.intermediate;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.LongConsumer;
import java.util.stream.IntStream;

public class MappingExample3 {
	public static void main(String[] args) {
		int[] intAry = { 1, 2, 3, 4, 5 };

		IntStream stream = Arrays.stream(intAry);
		stream.asDoubleStream().forEach(new DoubleConsumer() {
			@Override
			public void accept(double value) {
				System.out.println(value);
			}
		});

		Arrays.stream(intAry).asLongStream().forEach(new LongConsumer() {
			@Override
			public void accept(long value) {
				System.out.println(value);
			}
		});

		Arrays.stream(intAry).boxed().forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println(String.valueOf(t));
			}
		});

		double[] doubleAry = new double[] { 1.0, 2.0, 3.0, 4.0, 5.0 };
		Arrays.stream(doubleAry).boxed().forEach(new Consumer<Double>() {
			@Override
			public void accept(Double t) {
				System.out.println(String.valueOf(t));
			}
		});

	}
}
