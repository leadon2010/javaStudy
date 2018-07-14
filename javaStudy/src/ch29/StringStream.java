package ch29;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringStream {
	public static void main(String[] args) {
		String[] arr = { "YOON", "LEE", "KIM" };
		Stream<String> stm = Arrays.stream(arr);
		stm.forEach(s -> System.out.println(s));
	}
}
