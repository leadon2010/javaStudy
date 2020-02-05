package thisisjava.apiCommon.arrays;

import java.util.Arrays;

public class EqualsExample {
	public static void main(String[] args) {
		int[][] original = { { 1, 2 }, { 3, 4 } };
		System.out.println("얕은 복제");
		int[][] c1 = Arrays.copyOf(original, original.length);
		System.out.println("배열 비교: " + original.equals(c1));
		System.out.println("1차 비교: " + Arrays.equals(original, c1));
		System.out.println("2차 비교: " + Arrays.deepEquals(original, c1));

		System.out.println("깊은 복제");
		int[][] c2 = Arrays.copyOf(original, original.length);
		c2[0] = Arrays.copyOf(original[0], original[0].length);
		c2[1] = Arrays.copyOf(original[1], original[1].length);
		System.out.println("배열 비교: " + original.equals(c2));
		System.out.println("1차 비교: " + Arrays.equals(original, c2));
		System.out.println("2차 비교: " + Arrays.deepEquals(original, c2));

	}
}
