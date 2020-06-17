package stream.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

class Student implements Comparable<Student> {
	private String name;
	private int score;

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	@Override
	public int hashCode() {
		return this.name.hashCode() + this.score;
	}

	@Override
	public boolean equals(Object obj) {
		boolean val = false;
		Student std = (Student) obj;
		if (this.name.compareTo(std.name) == 0)
			val = true;
		else
			val = false;
		return val;
	}

	@Override
	public int compareTo(Student o) {
		return this.score - o.score;
	}

	@Override
	public String toString() {
		String str = String.format("%s %s", name, score);
		return str;
	}

}

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		String str = String.format("%s %s", name, age);
		return str;
	}
}

public class DistinceExample {
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
