package thisisjava.generic.test;

import java.util.Arrays;

class Persons {
	private String str;

	Persons(String str) {
		this.str = str;
	}

	@Override
	public String toString() {
		return str;
	}

}

class Workers extends Persons {
	Workers(String str) {
		super(str);
	}
}

class Students extends Persons {
	Students(String str) {
		super(str);
	}
}

class HighStudents extends Students {
	HighStudents(String str) {
		super(str);
	}
}

class Courses<T> {
	private String name;
	private T[] students;

	public Courses(String name, int capacity) {
		this.name = name;
		students = (T[]) (new Object[capacity]);
		// T[] s = new T[3]; 배열을 생성하려면 위의 방식처럼 해야한다.
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

public class NewWildcardExample {
	public static void registerCourse(Courses<?> course) {
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}

	public static void registerCourseStudent(Courses<? extends Students> course) {
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}

	public static void registerCourseWorker(Courses<? super Workers> course) {
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}

	public static void main(String[] args) {
		// 1.
		Courses<Persons> personCourse = new Courses<Persons>("일반인과정", 5);
		personCourse.add(new Persons("일반인"));
		personCourse.add(new Workers("직장인"));
		personCourse.add(new Students("학생"));
		personCourse.add(new HighStudents("고등학생"));

		// 2.
		Courses<Workers> workerCourse = new Courses<Workers>("직장인과정", 5);
		workerCourse.add(new Workers("직장인"));

		// 3.
		Courses<Students> studentCourse = new Courses<Students>("학생과정", 5);
		studentCourse.add(new Students("학생"));
		studentCourse.add(new HighStudents("고등학생"));

		// 4.
		Courses<HighStudents> highCourse = new Courses<HighStudents>("고등학생과정", 5);
		highCourse.add(new HighStudents("고등학생"));

		System.out.println("============================================");

		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highCourse);
		System.out.println();

//		registerCourseStudent(personCourse);
//		registerCourseStudent(workerCourse);
		registerCourseStudent(studentCourse);
		registerCourseStudent(highCourse);
		System.out.println();

		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
//		registerCourseWorker(studentCourse);
//		registerCourseWorker(highCourse);

		System.out.println("============================================");
	}

}
