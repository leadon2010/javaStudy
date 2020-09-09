package streams.collect;

import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class NoneExample {
	public static void main(String[] args) {
		IntStream iStream = IntStream.of(new int[] { 23, 33, 54, 66, 33 });
		iStream.forEach(new IntConsumer() {
			int cnt = 0;
			int sum = 0;

			@Override
			public void accept(int value) {
				sum += value;
//				System.out.println("sum: " + sum + ", value: " + value);
				System.out.println((double) sum / ++cnt);
			}
		});
	}
}
