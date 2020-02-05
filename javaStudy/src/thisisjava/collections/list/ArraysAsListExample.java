package thisisjava.collections.list;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동", "김길동", "이길동");
		for (String str : list) {
			System.out.println(str);
		}

		List<Integer> intList = Arrays.asList(1, 2, 3);
		for (Integer intVal : intList) {
			System.out.println(intVal);
		}
	}
}
