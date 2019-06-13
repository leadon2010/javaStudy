package com.yedam.generic;

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

	@Override
	public String toString() {
		return name;
	}

}

class Worker extends Person {
	private String company;

	Worker() {
	}

	Worker(String name, String company) {
		super(name);
		this.company = company;
	}

	public String getCompany() {
		return company;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}

class Student extends Person {
	private String university;

	Student() {
	}

	Student(String name) {
		super(name);
	}

	Student(String name, String university) {
		super(name);
		this.university = university;
	}

	public String getUniversity() {
		return university;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}

class HighStudent extends Student {
	private String highSchool;

	HighStudent() {
	}

	HighStudent(String name, String university, String highSchool) {
		super(name);
		this.highSchool = highSchool;
	}

	public String getHighSchool() {
		return highSchool;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}

public class WildCardExample {
	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("일반인과정", 5);
		personCourse.add(new Person("일반인1"));
		personCourse.add(new Worker("직장인1", null));
		personCourse.add(new Student("학생1", null));
		personCourse.add(new HighStudent("고등학생1", null, null));

		Course<Worker> workerCourse = new Course<Worker>("직장인과정", 5);
		workerCourse.add(new Worker("직장인2", null));

		Course<Student> studentCourse = new Course<Student>("학생과정", 5);
		studentCourse.add(new Student("학생2", null));
		studentCourse.add(new HighStudent("고등학생2", null, null));

		Course<HighStudent> highStudentCourse = new Course<HighStudent>("고등학생과정", 5);
		highStudentCourse.add(new HighStudent("고등학생3", null, null));

		System.out.println("===========================");
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
		System.out.println("===========================");

	}// end of main

	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}

	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}

	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}

}
