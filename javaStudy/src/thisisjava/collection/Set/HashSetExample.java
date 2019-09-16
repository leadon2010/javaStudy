package thisisjava.collection.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();

		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBatis");

		for (String s : set) {
			System.out.println(s);
		}
		System.out.println();

		int size = set.size();
		System.out.println("총 객체수: " + size);

		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}

		set.remove("JDBC");
		set.remove("iBatis");

		System.out.println("총 객체수: " + set.size());

		iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}

		set.clear();
		if (set.isEmpty()) {
			System.out.println("비어 있음.");
		}

		// Set에 담을 때 Comparable 인터페이스를 구현하는 클래스이더라도 정렬은 안된다.
		// TreeSet 에 담을 때 정렬기준으로 저장된다.
		System.out.println();
		Set<Person> perset = new HashSet<Person>();
		perset.add(new Person("홍길동", 45));
		perset.add(new Person("박문수", 30));
		perset.add(new Person("갑순이", 35));
		perset.add(new Person("김갑수", 15));

		for (Person p : perset) {
			System.out.println(p.name + " - " + p.age);
		}
		System.out.println();

		Iterator<Person> iter = perset.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next().age);
		}

	}
}
