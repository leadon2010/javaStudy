package ch30;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;

class StreamOfStream {
	public static void main(String[] args) {
		// ex 1
		Stream.of(11, 22, 33, 44).forEach(n -> System.out.print(n + "\t"));
		System.out.println();

		// ex 2
		String s1 = "so simple";
		String s2 = " niece";
		String s3 = s1 + s2;
		Stream.of(s3).forEach(s -> System.out.print(s + "\t"));
		System.out.println();

		// ex 3
		List<String> sl = Arrays.asList("Toy", "Robot", "Box");
		Stream.of(sl).forEach(w -> System.out.print(w + "\t"));
		System.out.println();
	}
}
