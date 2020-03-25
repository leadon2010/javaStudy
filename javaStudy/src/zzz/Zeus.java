package zzz;

import java.util.ArrayList;
import java.util.List;

public class Zeus {
	public static void main(String[] args) {
		Student s1 = new Student("Hong", "s111", "English");
		Student s2 = new Student("Hong", "s111", "English");
		Student s3 = new Student("Hong", "s111", "English");

		Student[] students = { s1, s2, s3 };
		for (Student s : students) {
			System.out.println(s);
		}

		List<Student> list = new ArrayList<>();

	}
}
