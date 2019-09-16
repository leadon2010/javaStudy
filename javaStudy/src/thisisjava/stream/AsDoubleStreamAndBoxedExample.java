package thisisjava.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AsDoubleStreamAndBoxedExample {
	public static void main(String[] args) {
		int[] intAry = { 1, 2, 3, 4, 5 };

		IntStream intStream = Arrays.stream(intAry);
		intStream.asDoubleStream().forEach(d -> System.out.println(d));
		System.out.println();

		intStream = Arrays.stream(intAry);
		intStream.boxed().forEach(obj -> System.out.println(obj));

	}
}
