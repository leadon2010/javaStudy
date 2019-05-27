package yoon.ch29;

import java.util.Arrays;
import java.util.List;

class MapToInt2 {
	public static void main(String[] args) {
		List<String> ls = Arrays.asList("Box", "Robot", "Simple", "lch");

		ls.stream().mapToInt(s -> s.length()).forEach(n -> System.out.print(n + "\t"));

		System.out.println();
	}
}