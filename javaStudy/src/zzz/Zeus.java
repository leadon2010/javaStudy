package zzz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Zeus {
	public static void main(String[] args) {
		System.out.println("==================[ Arrays ]");
		Student s1 = new Student("Hong", "s111", "English");
		Student s2 = new Student("Hong", "s222", "Korean");
		Student s3 = new Student("Hong", "s333", "Spanish");

		Student[] students = { s1, s2, s3 };
		for (Student s : students) {
			System.out.println(s);
		}
		System.out.println("==================[ ArrayList ]");
		List<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);

		for (Student s : list) {
			System.out.println(s);
		}
		System.out.println("==================[ HashSet ]");
		Set<Student> sets = new HashSet<>();
		sets.add(s1);
		sets.add(s2);
		sets.add(s3);
//		for (Student s : sets) {
//			System.out.println(s);
//		}
		Iterator<Student> sIter = sets.iterator();
		while (sIter.hasNext()) {
			System.out.println(sIter.next());
		}

		System.out.println("==================[ Map.Key ]");
		Map<Integer, Student> map = new HashMap<>();
		map.put(1, s1);
		map.put(2, s2);
		map.put(3, s3);

		Set<Integer> set = map.keySet();
		Iterator<Integer> iter = set.iterator();
		while (iter.hasNext()) {
			Integer keys = iter.next();
			System.out.println(keys + ", " + map.get(keys));
		}
		System.out.println("==================[ Map.Entry ]");
		Set<Map.Entry<Integer, Student>> ent = map.entrySet();
		Iterator<Map.Entry<Integer, Student>> iter2 = ent.iterator();
		while (iter2.hasNext()) {
			Map.Entry<Integer, Student> keyEnt = iter2.next();
			System.out.println(keyEnt.getKey() + ", " + keyEnt.getValue());
		}
		System.out.println("<<< end of program >>>");
	}
}
