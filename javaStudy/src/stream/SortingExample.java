package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortingExample {
	public static void main(String[] args) {
		IntStream intStream = Arrays.stream(new int[] { 5, 3, 2, 1, 4 });
		intStream.sorted().forEach(s -> System.out.print(s + ","));
		System.out.println();

		List<Student> studentList = Arrays.asList(new Student("hong", 30), new Student("shin", 20),
				new Student("kgng", 10));
		studentList.stream().sorted().forEach(s -> System.out.print(s.getScore() + ","));
		System.out.println();

		studentList.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.print(s.getScore() + ","));

	}
}
