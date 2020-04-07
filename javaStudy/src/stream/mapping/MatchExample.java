package stream.mapping;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MatchExample {
	public static void main(String[] args) {
		int[] intArr = { 2, 4, 6 };
		boolean isTrue = Arrays.stream(intArr).noneMatch(i -> i % 2 == 0);
		System.out.println(isTrue);
		
	}
}
