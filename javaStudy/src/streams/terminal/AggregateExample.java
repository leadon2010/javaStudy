package streams.terminal;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.function.DoubleConsumer;

public class AggregateExample {
	public static void main(String[] args) {
		int[] intAry = { 1, 2, 3, 4, 5 };

		OptionalDouble od = Arrays.stream(intAry).filter(t -> t % 2 == 1 && t > 5).average();
		
//		if (od.isPresent())
//			System.out.println("평균: " + od.getAsDouble());
//		else
//			System.out.println("평균: 0,0");
//
//		double dResult = od.orElse(0.0);
//		System.out.println(dResult);

		od.ifPresent(new DoubleConsumer() {
			@Override
			public void accept(double value) {
				System.out.println("평균: " + value);
			}
		});
	}
}
