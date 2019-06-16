package collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

class Person {
	String name;
	int age;

	Person() {
	}
}

public class Collections {
	public static void main(String[] args) {
		Collection<Person> col = new HashSet<>();
		col.add(new Person());

		Arrays.asList(1, 2, 3, 4);
		System.out.println();

//		Arrays.equals(a, a2);

		int result = new Integer(3).hashCode();
		System.out.println(result);
		"hello".hashCode();

		Set<Person> p = new HashSet<>();
		p.add(new Person());

	}
}
