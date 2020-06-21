package streams.exam;

import java.util.Arrays;

public class Example01 {
	public static void main(String[] args) {
		int[] intAry = new int[] { 3, 2, 5, 7, 1 };
		Arrays.sort(intAry, 0, intAry.length);
		for (int i : intAry) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("==============================");

		// => Stream 을 활용하여 동일한 결과를 만들어보세요.
		intAry = new int[] { 3, 2, 5, 7, 1 };
		Arrays.stream(intAry).sorted().forEach(s -> System.out.print(s + " "));
	}
}
