package stream;

import java.util.Arrays;

public class LoopingExample {

	public static void main(String[] args) {
		int[] intAry = { 1, 2, 3, 4, 5 };
		System.out.println("peek call.");
		Arrays.stream(intAry).filter(n -> n % 2 == 0).peek(n -> System.out.println(n));
		System.out.println("final call");
		int total = Arrays.stream(intAry).filter(a -> a % 2 == 0).peek(s -> System.out.println(s)).sum();
		System.out.println("Sum: " + total);

		System.out.println("forEach call.");
		Arrays.stream(intAry).filter(a -> a % 2 == 0).forEach(s -> System.out.println(s));
	}

}
