package collection.List;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동", "김길동", "김동길");
		for (String str : list) {
			System.out.println(str);
		}

		List<Integer> iList = Arrays.asList(1, 2, 3, 4, 5);
		for (int value : iList) {
			System.out.println(value);
		}
	}
}
