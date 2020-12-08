package streams.test.exam04;

import java.util.Arrays;
import java.util.List;

public class Exam04 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(//
				new Student("Hong", 77, 88), //
				new Student("Hwang", 44, 55), //
				new Student("Park", 55, 33), //
				new Student("Choi", 44, 22)//
		);

		list.stream().filter(s -> s.getEngScore() + s.getMatScore() < 100)
				.forEach(s -> System.out.println(s.getName()));
	}
}
