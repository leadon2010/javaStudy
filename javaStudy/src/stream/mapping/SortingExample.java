package stream.mapping;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

class StudentCom implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

public class SortingExample {
	public static void main(String[] args) {
		IntStream intStream = Arrays.stream(new int[] { 5, 3, 2, 1, 4 });
		intStream.sorted().forEach(s -> System.out.println(s));

		System.out.println("=======================");

		List<Student> sList = Arrays.asList(new Student("Hong", 30), new Student("Hwang", 10), new Student("Kim", 20),
				new Student("Choi", 40));
		sList.stream().sorted().forEach(s -> System.out.println(s.getName() + ", " + s.getScore()));

		System.out.println("=======================");

		sList.stream().sorted(new StudentCom()).forEach(s -> System.out.println(s.getName()));
	}
}
