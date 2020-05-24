package generic;

import java.util.Arrays;

class Person {
	private String name;

	Person(String name) {
		this.name = name;
	}

	String getName() {
		return this.name;
	}
}

class Worker extends Person {
	Worker(String name) {
		super(name);
	}
}

class Student extends Person {
	Student(String name) {
		super(name);
	}
}

class HighStudent extends Student {
	HighStudent(String name) {
		super(name);
	}
}

class Course<T> {
	private String name;
	private T[] students;

	public Course(String name, int capacity) {
		this.name = name;
		students = (T[]) new Object[capacity];
	}

	public String getName() {
		return name;
	}

	public T[] getStudents() {
		return students;
	}

	public void add(T t) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = t;
				break;
			}
		}
	} // end of add()
}

public class WildCardExample {

	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + " 수강생" + Arrays.toString(course.getStudents()));
	}

	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + " 수강생" + Arrays.toString(course.getStudents()));
	}

	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + " 수강생" + Arrays.toString(course.getStudents()));
	}

	public static void main(String[] args) {
		Course<Person> coursePerson = new Course<>("일반인과정", 5);
		coursePerson.add(new Person("일반인"));
		coursePerson.add(new Worker("직장인"));
		coursePerson.add(new Student("학생"));
		coursePerson.add(new HighStudent("고등학생"));

		Course<Worker> courseWorker = new Course<>("직장인과정", 5);
		courseWorker.add(new Worker("직장인"));

		Course<Student> courseStudent = new Course<>("학생과정", 5);
		courseStudent.add(new Student("학생"));
		courseStudent.add(new HighStudent("고등학생"));

		Course<HighStudent> courseHigh = new Course<>("고등학생과정", 5);
		courseHigh.add(new HighStudent("고등학생"));

		// 전체 타입을 다 포함.
		registerCourse(coursePerson);
		registerCourse(courseWorker);
		registerCourse(courseStudent);
		registerCourse(courseHigh);

		// 상위제한
		register
	}
}
