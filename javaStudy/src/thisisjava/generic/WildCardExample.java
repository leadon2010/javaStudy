package thisisjava.generic;

import java.util.Arrays;

class Course<T> {
	private String name;
	private T[] students;

	public Course(String name, int capacity) {
		this.name = name;
		students = (T[]) new Object[capacity];
	}

	public String getName() {
		return this.name;
	}

	public T[] getStudents() {
		return this.students;
	}

	public void add(T t) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
}

class Person {

}

class Worker extends Person {

}

class Student extends Person {

}

class HighStudent extends Student {

}

public class WildCardExample {
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + " 수강생:" + Arrays.toString(course.getStudents()));
	}

	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + " 수강생:" + Arrays.toString(course.getStudents()));
	}

	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + " 수강생:" + Arrays.toString(course.getStudents()));
	}

	public static void main(String[] args) {
		Course<Person> personCourse = new Course<>("일반인 과정", 5);
		Course<Worker> workerCourse = new Course<>("직장인과정", 5);
		Course<Student> studentCourse = new Course<>("학생과정", 5);
		Course<HighStudent> highCourse = new Course<>("고등학생과정", 5);

		personCourse.add(new Person());
		personCourse.add(new Worker());
		personCourse.add(new Student());
		personCourse.add(new HighStudent());

		workerCourse.add(new Worker());

		studentCourse.add(new Student());
		studentCourse.add(new HighStudent());

		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);

		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);

		registerCourseStudent(studentCourse);
		registerCourseStudent(highCourse);
		
		

	}
}
