package stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SortingExample {
	public static void main(String[] args) {
		IntStream intStream = Arrays.stream(new int[] { 1, 4, 6, 2, 3 });
		intStream.sorted().forEach(i -> System.out.println(i));

		Stream<Student> stream = Arrays
				.stream(new Student[] { new Student("Hong", 10), new Student("Hwang", 9), new Student("Park", 11) });
		stream.sorted().forEach(s -> System.out.println(s.getName() + "," + s.getScore()));

	}
}
