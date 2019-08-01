package thisisjava.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Student {
	public int sno;
	public String name;

	public Student(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}

	@Override
	public int hashCode() {
//		return super.hashCode();
		return name.hashCode() + sno;
	}

	@Override
	public boolean equals(Object obj) {
//		return super.equals(obj);
		Student std = (Student) obj;
		return (name.equals(std.name) && sno == std.sno);
	}

}

public class HashMapExample2 {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<>();
		map.put(new Student(1, "hong"), 95);
		map.put(new Student(1, "hong"), 95);

		Set<Student> keySet = map.keySet();
		Iterator<Student> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.name + "=" + student.sno + ", " + map.get(student));
		}

	}
}
