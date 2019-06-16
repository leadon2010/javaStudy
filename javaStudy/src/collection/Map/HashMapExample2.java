package collection.Map;

import java.util.HashMap;
import java.util.Map;

class Student {
	int sno;
	String name;

	public Student(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return sno + name.hashCode();
//		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student) obj;
			return (sno == student.sno) && (name.equals(student.name));
		} else {
			return false;
		}
//		return super.equals(obj);
	}

}

public class HashMapExample2 {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<>();

		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(1, "홍길동"), 90);

		System.out.println("총 Entry 수: " + map.size());
	}
}
