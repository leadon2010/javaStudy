package collection.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Person {
	String ssno;
	String name;

	Person(String ssno, String name) {
		this.ssno = ssno;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		Person p = (Person) obj;
		boolean b1 = ssno.equals(p.ssno);
		boolean b2 = name.equals(p.name);
		return b1 && b2;
//		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		return ssno.hashCode() + name.hashCode();
//		return super.hashCode();
	}
}

public class ClassExample {
	public static void main(String[] args) {
		Map<Person, String> map = new HashMap<>();
		map.put(new Person("1111", "first"), "hello");
		map.put(new Person("1111", "first"), "nice");
		map.put(new Person("1111", "third"), "good");
		Set<Person> set = map.keySet();
		Iterator<Person> itr = set.iterator();
		while (itr.hasNext()) {
			Person person = itr.next();
			System.out.println("(" + person.ssno + "," + person.name + ")" + "- " + map.get(person));
		}
	}
}
