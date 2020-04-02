package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Bstream {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hong", "Hwang", "Park", "Choi");
		Stream<String> pstream = list.parallelStream();
		pstream.forEach((t) -> {
			print(t);
		});
		System.out.println("=======================");

		Stream<String> stream = list.stream();
		stream.forEach((t) -> {
			print(t);
		});
	}

	static void print(String str) {
		System.out.println(str + " : " + Thread.currentThread().getName());
	}

}
