package thisisjava.generic;

import java.util.Arrays;

public class WildCardExample {
	// 와일드카드를 사용하지 않고 타입파라미터에 제한을 두려면 extends는 가능하나 super 불가능.
	public static <T extends Student> void registerCrs(Course<T> course) {
		System.out.println(course.getName() + " 수강생:" + Arrays.toString(course.getStudents()));
	}

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

		System.out.println("==============================");
//		registerCrs(personCourse);
//		registerCrs(workerCourse);
		registerCrs(studentCourse);
		registerCrs(highCourse);

		System.out.println("==============================");
		personCourse.add(new Person());
		personCourse.add(new Worker());
		personCourse.add(new Student());
		personCourse.add(new HighStudent());

		workerCourse.add(new Worker());

		studentCourse.add(new Student());
		studentCourse.add(new HighStudent());

		highCourse.add(new HighStudent());

		System.out.println("==============================");
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highCourse);

		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);

		registerCourseStudent(studentCourse);
		registerCourseStudent(highCourse);

	}
}
