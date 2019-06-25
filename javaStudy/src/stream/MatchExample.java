package stream;

import java.util.Arrays;

public class MatchExample {

	public static void main(String[] args) {
		int[] intAry = { 2, 4, 6 };
		boolean result = Arrays.stream(intAry).allMatch(a -> a % 2 == 0);
		System.out.println("twofold?: " + result);

		result = Arrays.stream(intAry).anyMatch(a -> a % 3 == 0);
		System.out.println("any threefold?: " + result);

		result = Arrays.stream(intAry).noneMatch(a -> a % 3 == 0);
		System.out.println("none threefold?: " + result);
	}

}
