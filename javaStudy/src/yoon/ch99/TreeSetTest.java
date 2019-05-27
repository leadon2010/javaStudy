package yoon.ch99;

import java.util.Iterator;
import java.util.TreeSet;

class Person implements Comparable {
	String name;
	int age;

	public Person(String n, int a) {
		name = n;
		age = a;
	}

	@Override
	public int compareTo(Object obj) {
		return age - ((Person) obj).age;
	}

}

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<Person> tset = new TreeSet<>();

		tset.add(new Person("aaa", 22));
		tset.add(new Person("aab", 12));
		tset.add(new Person("aac", 2));

		for (Person n : tset)
			System.out.println(n);

		System.out.println();

		for (Iterator<Person> itr = tset.iterator(); itr.hasNext();)
			System.out.println(itr.next());

	}

}
