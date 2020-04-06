package stream.mapping;

import java.util.Arrays;
import java.util.List;

public class MapExample {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("Hong", 10), new Student("Hwang", 20), new Student("Kim", 30));

		list.stream().mapToInt(s -> s.getScore()).forEach(score -> System.out.println(score));
	}
}
