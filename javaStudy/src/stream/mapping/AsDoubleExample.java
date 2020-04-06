package stream.mapping;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AsDoubleExample {
	public static void main(String[] args) {
		int[] intArr = { 1, 2, 3, 4, 5 };

		IntStream stream = Arrays.stream(intArr);
		stream.asDoubleStream().forEach(d -> System.out.println(d));

		System.out.println("=============================");

		stream = Arrays.stream(intArr);
		stream.boxed().forEach(obj -> System.out.println(obj.intValue()));

	}
}
