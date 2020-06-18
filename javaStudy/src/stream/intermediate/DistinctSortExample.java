package stream.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class DistinctSortExample {
	public static void main(String[] args) {
		List<Student> students = Arrays.asList(new Student("Hong", 20), new Student("Hong", 20),
				new Student("Hwang", 30), new Student("Park", 25));

		System.out.println("---- distinct ----");
		students.stream().distinct().forEach(System.out::println);

		System.out.println("---- sorted ----");
		students.stream().sorted().sorted(Comparator.reverseOrder()).forEach(System.out::println);

		System.out.println("-------------------------------");
		Stream.of(new Person("Hong", 20), new Person("Hwang", 30), new Person("Park", 25))
				.sorted((o1, o2) -> o1.getAge() - o2.getAge()).forEach(System.out::println);
	}
}
