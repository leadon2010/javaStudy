package api.objects;

import java.util.Comparator;
import java.util.Objects;

public class CompareExample2 {

	class Student {
		int sno;

		Student(int sno) {
			this.sno = sno;
		}
	}

	class StudentComparator implements Comparator<Student> {

		@Override
		public int compare(Student s1, Student s2) {
			return s1.sno - s2.sno;
		}

	}

	public static void main(String[] args) {
		CompareExample2 ce = new CompareExample2();
		Student s1 = ce.new Student(1);
		Student s2 = ce.new Student(1);
		Student s3 = ce.new Student(2);

		int result = Objects.compare(s1, s2, ce.new StudentComparator());
		System.out.println(result);

		result = Objects.compare(s1, s3, new Comparator<CompareExample2.Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.sno - o2.sno;
			}
		});
		System.out.println(result);

	}

	public void test() {
		Student s1 = new Student(1);
	}
}
