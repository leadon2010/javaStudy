package thisisjava.apiCommon.objects;

import java.util.Arrays;
import java.util.Objects;

public class EqualsAndDeepEqualsExample {
	public static void main(String[] args) {
		Integer o1 = 1000;
		Integer o2 = 1000;
		System.out.println(Objects.equals(o1, o2));
		System.out.println(Objects.equals(o1, null));
		System.out.println(Objects.equals(null, o2));
		System.out.println(Objects.equals(null, null)); // 두 매개값이 null 일 경우 true 를 리턴.
		System.out.println();

		Integer[] arr1 = { 1, 2 };
		Integer[] arr2 = { 1, 2 };
		System.out.println(Objects.equals(arr1, arr2)); // Object 의 equals 메소드 사용.
		System.out.println(Objects.deepEquals(arr1, arr2)); // Arrays.deepEquals() 사용함. 배열의 값이 같으면 true.
		System.out.println(Arrays.deepEquals(arr1, arr2));
		System.out.println();

		System.out.println(Objects.deepEquals(arr1, null));
		System.out.println(Objects.deepEquals(null, arr2));
		System.out.println(Objects.deepEquals(null, null));
	}
}
