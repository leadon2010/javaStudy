package thisisjava.collection;

import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

class Student implements Comparable<Student> {
	String name;
	int age;

	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Student o) {
		// return this.age - o.age;
		return this.name.compareTo(o.name);
	}

}

class ComparatorStudent implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.age - o2.age;
	}

}

public class ComparableExample {
	public static void main(String[] args) {
		Student s1 = new Student("aaa", 30);
		Student s2 = new Student("bbb", 20);
		Student s3 = new Student("ccc", 10);

		// TreeSet 기준.
		TreeSet<Student> set = new TreeSet<>(new ComparatorStudent());

		set.add(s1);
		set.add(s2);
		set.add(s3);

		for (Student s : set) {
			System.out.println(s.name + "-" + s.age);
		}
		System.out.println();

		// TreeMap 기준.
		TreeMap<Student, Integer> map = new TreeMap<>(new ComparatorStudent());
		map.put(s1, 10);
		map.put(s2, 20);
		map.put(s3, 30);

		System.out.println("[keySet]");
		Set<Student> sset = map.keySet();
		map.keySet();
		for (Student stu : sset) {
			System.out.println(stu.name + "-" + stu.age + ", " + map.get(stu));
		}
		System.out.println();

		System.out.println("[entrySet]");
		Set<Map.Entry<Student, Integer>> mset = map.entrySet();
		for (Map.Entry<Student, Integer> emap : mset) {
			System.out.println(emap.getKey().name + "-" + emap.getKey().age + ", " + emap.getValue());
		}
		System.out.println();

		// DescendingMap 사용.
		NavigableMap<Student, Integer> nmap = map.descendingMap();

		System.out.println("[Navigable keySet]");
		sset = nmap.keySet();
		for (Student stu : sset) {
			System.out.println(stu.name + "-" + stu.age + ", " + map.get(stu));
		}
		System.out.println();

		System.out.println("[Navigable entrySet]");
		mset = nmap.entrySet();
		for (Map.Entry<Student, Integer> emap : mset) {
			System.out.println(emap.getKey().name + "-" + emap.getKey().age + ", " + emap.getValue());
		}
		System.out.println();

	}
}
