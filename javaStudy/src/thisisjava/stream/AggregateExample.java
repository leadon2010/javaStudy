package thisisjava.stream;

import java.util.Arrays;

public class AggregateExample {

	public static void main(String[] args) {
		int[] intAry = new int[] { 1, 2, 3, 4, 5 };
		long count = Arrays.stream(intAry).filter(a -> a % 2 == 0).peek(n -> System.out.println(n)).count();
		System.out.println("twofold: " + count + " cnt");

		long sum = Arrays.stream(intAry).filter(a -> a % 2 == 0).sum();
		System.out.println("twofold sum: " + sum);

		double avg = Arrays.stream(intAry).filter(a -> a % 2 == 0).average().getAsDouble();
		System.out.println("twofold avg: " + avg);

		int max = Arrays.stream(intAry).max().getAsInt();
		System.out.println("twofold max: " + max);

		int min = Arrays.stream(intAry).min().getAsInt();
		System.out.println("twofold min: " + min);

		int first = Arrays.stream(intAry).filter(a -> a % 4 == 0).findFirst().getAsInt();
		System.out.println("twofold first: " + first);

	}

}
