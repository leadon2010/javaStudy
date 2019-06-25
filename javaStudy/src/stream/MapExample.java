package stream;

import java.util.Arrays;
import java.util.List;

public class MapExample {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("hong", 40), new Student("shin", 20), new Student("you", 30));
		list.stream().mapToInt(Student::getScore).forEach(System.out::println);
		;
	}
}
