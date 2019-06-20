package zone.study;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.TreeSet;

class Person implements Comparable<Person> {
	String name;
	int height;

	public Person(String name, int height) {
		super();
		this.name = name;
		this.height = height;
	}

	@Override
	public int compareTo(Person o) {
		return name.compareTo(o.name);
	}

}

class Student1 {
	String name;
	int age;

	public Student1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object o) {
		Student1 s = (Student1) o;
		return this.name.equals(s.name) && this.age == s.age;
	}

}

public class DateExample {

	static void printStar(int col, int row, String str) {
		for (int j = 0; j < row; j++) {
			for (int i = 0; i < col; i++) {
				System.out.print(str + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Student1 s1 = new Student1("hong", 20);
		Student1 s2 = new Student1("hong", 20);
		System.out.println(s1.equals(s2));

		System.out.printf("%10s", "hello");

//		printStar(4, 5, "*");
//		TreeSet<Person> set = new TreeSet<>();
//		Person p1 = new Person("kang", 175);
//		Person p2 = new Person("choi", 180);
//		Person p3 = new Person("hong", 184);
//		set.add(p1);
//		set.add(p2);
//		set.add(p3);
//
//		for (Person p : set) {
//			System.out.println(p.name);
//		}

//		Date now = new Date();
//		System.out.println(now.toString());
//
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
//		System.out.println(sdf.format(now));
//
//		LocalDate ldate = LocalDate.of(2019, 6, 1);
//		System.out.println(ldate.getYear() + "년" + ldate.getMonthValue() + "월" + ldate.getDayOfMonth() + "일");
//
//		System.out.println("월의 첫날: " + ldate.getDayOfWeek() + "," + ldate.getDayOfMonth());
//
//		LocalDateTime ldt = LocalDateTime.now();
	}
}
