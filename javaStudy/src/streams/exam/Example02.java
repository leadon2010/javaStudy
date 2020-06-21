package streams.exam;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Example02 {
	public static void main(String[] args) {
		// 1 ~ 20 까지의 IntStream 을 생성하고 합하는 작업.
		int sum = IntStream.rangeClosed(1, 20).filter(new IntPredicate() {
			@Override
			public boolean test(int value) {
				return value % 2 == 0;
			}
		}).peek(s -> System.out.print(s + " ")).sum();
		System.out.println();
		System.out.println("결과: " + sum);

		// 2 4 6 8 10 12 14 16 18 20
		// 결과: 110
	}
}
