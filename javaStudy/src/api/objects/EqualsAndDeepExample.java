package api.objects;

import java.util.Arrays;
import java.util.Objects;

public class EqualsAndDeepExample {
	public static void main(String[] args) {
		Integer o1 = 1000;
		Integer o2 = 1000;
//		System.out.println(Objects.equals(o1, o2));
//		System.out.println(Objects.deepEquals(o1, o2));

		Integer[] arr1 = { 1, 2 };
		Integer[] arr2 = { 1, 2 };
		System.out.println(Objects.equals(arr1, arr2));
		System.out.println(Objects.deepEquals(arr1, arr2));
		System.out.println(Arrays.deepEquals(arr1, arr2));

//		System.out.println(equals(o1, o2));
	}

	static boolean equals(Object o1, Object o2) {
		return o1 == o2 || (o1 != null && o1.equals(o2));
	}
}
