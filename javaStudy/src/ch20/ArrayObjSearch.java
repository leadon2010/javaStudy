package ch20;

import java.util.Arrays;

public class ArrayObjSearch {
	public static void main(String[] args) {
		Person[] arr = new Person[3];
		arr[0] = new Person("LEE", 15, 170);
		arr[1] = new Person("KIM", 25, 180);
		arr[2] = new Person("PARK", 20, 185);
		Arrays.sort(arr);
		int idx = Arrays.binarySearch(arr, new Person("what", 20, 180));
		System.out.println(arr[idx]);
	}
}
