package api.objects;

import java.util.Comparator;
import java.util.Objects;

public class CompareExample {
	@SuppressWarnings("unchecked")
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

	@SuppressWarnings("rawtypes")
	static class StudentComparator implements Comparator {

		@Override
		public int compare(Object o1, Object o2) {
			Student st1 = (Student) o1;
			Student st2 = (Student) o2;
			return st1.sno - st2.sno;
		}

	} // end of StudentComparator
}
