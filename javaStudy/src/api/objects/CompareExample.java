package api.objects;

import java.util.Comparator;
import java.util.Objects;

public class CompareExample {
	public static void main(String[] args) {
		Student s1 = new Student(1);
		Student s2 = new Student(2);
		Student s3 = new Student(3);

		int result = Objects.compare(s1, s2, new StudentComparator());
		System.out.println(result);
		result = Objects.compare(s3, s2, new StudentComparator());
		System.out.println(result);
	}

	static class Student {
		int sno;

		Student(int sno) {
			this.sno = sno;
		}
	} // end of Student

	static class StudentComparator implements Comparator<Student> {
		@Override
		public int compare(Student o1, Student o2) {
			return o1.sno - o2.sno;
		}
	} // end of StudentComparator
}
