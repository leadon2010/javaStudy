package collection;

import java.util.Comparator;
import java.util.TreeSet;

class Student implements Comparable<Student> {
	String name;
	int age;

	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Student o) {
		return this.age - o.age;
	}

}

class AscendStudent implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o2.age - o1.age;
	}

}

public class ComparableExample {
	public static void main(String[] args) {
		Student s1 = new Student("aaa", 10);
		Student s2 = new Student("bbb", 20);

		TreeSet<Student> set = new TreeSet<>(new AscendStudent());

		set.add(s1);
		set.add(s2);

		for (Student s : set) {
			System.out.println(s.name + "-" + s.age);
		}
	}
}
