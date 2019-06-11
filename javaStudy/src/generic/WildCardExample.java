package generic;

import java.util.Arrays;

class Person {
	private String name;

	Person() {

	}

	Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}

class Worker extends Person {
	private String company;

	Worker() {

	}

	Worker(String name, String company) {
		super();
		this.company = company;
	}

	public String getCompany() {
		return company;
	}
}

class Student extends Person {
	private String university;

	Student() {

	}

	Student(String name, String university) {
		super();
		this.university = university;
	}

	public String getUniversity() {
		return university;
	}
}

class HighStudent extends Student {
	private String highSchool;

	HighStudent() {

	}

	HighStudent(String name, String university, String highSchool) {
		super();
		this.highSchool = highSchool;
	}

	public String getHighSchool() {
		return highSchool;
	}
}

class Course<T> {
	private String name;
	private T[] students;

	public Course(String name, int capacity) {
		this.name = name;
		students = (T[]) (new Object[capacity]);
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
	}
}

public class WildCardExample {
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}

	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}

	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}

	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("일반인과정", 5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인", null));
		personCourse.add(new Student("학생", null));
		personCourse.add(new HighStudent("고등학생", null, null));

		Course<Worker> workerCourse = new Course<Worker>("직장인과정", 5);
		workerCourse.add(new Worker("직장인", null));

		Course<Student> studentCourse = new Course<Student>("학생과정", 5);
		studentCourse.add(new Student("학생", null));
		studentCourse.add(new HighStudent("고등학생", null, null));

		Course<HighStudent> highStudentCourse = new Course<HighStudent>("고등학생과정", 5);
		highStudentCourse.add(new HighStudent("고등학생", null, null));

		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);
		System.out.println();

		registerCourseStudent(studentCourse);
		registerCourseStudent(highStudentCourse);
		System.out.println();

		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
		System.out.println();

	}// end of main

}
