package collections.tree;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {
	public static void main(String[] args) {
		TreeSet<Person> set = new TreeSet<>();
		set.add(new Person("홍길동", 45));
		set.add(new Person("김자바", 25));
		set.add(new Person("박지원", 31));

		Iterator<Person> iter = set.iterator();
		while (iter.hasNext()) {
			Person nP = iter.next();
			System.out.println(nP.age + ", " + nP.name);
		}
	}
}
