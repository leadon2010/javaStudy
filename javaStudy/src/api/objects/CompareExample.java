package api.objects;

import java.util.Comparator;
import java.util.Objects;

class Student {
	int sno;

	Student(int sno) {
		this.sno = sno;
	}
}

class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
//		if (o1.sno < o2.sno)
//			return -1;
//		else if (o1.sno > o2.sno)
//			return 1;
//		else
//			return 0;
		return Integer.compare(o1.sno, o2.sno); // Integer 클래스의 compare 메소드 사용.
	}
}

public class CompareExample {
	public static void main(String[] args) {
		Student s1 = new Student(1);
		Student s2 = new Student(1);
		Student s3 = new Student(3);

		int result = Objects.compare(s1, s2, new StudentComparator()); // 비교자: new StudentComparator()
		System.out.println(result);
		result = Objects.compare(s1, s3, new StudentComparator());
		System.out.println(result);

	}
}
