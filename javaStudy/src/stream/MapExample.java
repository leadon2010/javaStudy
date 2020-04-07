package stream;

import java.util.Arrays;
import java.util.List;

public class MapExample {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("Hong", 90), new Student("Hwang", 80), new Student("Park", 70));
		list.stream().mapToInt(s -> s.getScore()).forEach(s -> System.out.println(s));

		System.out.println("==============");

		list = Arrays.asList(new Student("Hong", 90), new Student("Hwang", 80), new Student("Park", 70));
		list.stream().filter(s -> s.getScore() >= 80).forEach(s -> System.out.println(s.getName()));

	}
}
