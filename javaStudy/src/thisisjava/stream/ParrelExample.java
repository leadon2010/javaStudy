package thisisjava.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParrelExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("hong", "shin", "kang", "lambda", "parrel");

		Stream<String> stream = list.stream();
		stream.forEach(ParrelExample::print);
		System.out.println();

		Stream<String> parrelStream = list.parallelStream();
		parrelStream.forEach(ParrelExample::print);
	}

	static void print(String str) {
		System.out.println(str + " : " + Thread.currentThread().getName());
	}
}
