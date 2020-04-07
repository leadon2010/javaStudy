package stream;

import java.util.stream.IntStream;

public class LoopingExample {
	public static void main(String[] args) {
		int sum = IntStream.rangeClosed(1, 10).filter(n -> n % 2 == 0).peek(s -> System.out.println(s)).sum();
		System.out.println("sum: " + sum);
	}
}
