package streams.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatMapToIntExample {
	public static void main(String[] args) {

		Member.getMembers().stream().flatMapToInt(new Function<Member, IntStream>() {
			@Override
			public IntStream apply(Member t) {
				return IntStream.of(t.age);
			}

		}).average().ifPresent(new DoubleConsumer() {
			@Override
			public void accept(double value) {
				System.out.println("double Value: " + value);
			}
		});

	}
}
