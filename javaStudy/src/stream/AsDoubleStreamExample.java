package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AsDoubleStreamExample {
	public static void main(String[] args) {
		int[] intArr = { 1, 2, 3, 4, 5 };
		IntStream intStream = Arrays.stream(intArr);
		intStream.asDoubleStream().forEach(i -> System.out.println(i));
		
		intStream = IntStream.rangeClosed(1, 5);
		intStream.boxed().forEach(obj -> System.out.println(Integer.valueOf(obj)));
		
	}
}
