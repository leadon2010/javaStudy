package ch23;

import java.util.Comparator;
import java.util.TreeSet;

class Person implements Comparable<Person> {
	String name;
	int age;

	Person() {

	}

	public Person(String n, int a) {
		name = n;
		age = a;
	}

	@Override
	public int compareTo(Person p) {
		return age - p.age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}

class PersonComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		return o2.age - o1.age;
	}

}

public class ComparablePerson {
	public static void main(String[] args) {
		Person p1 = new Person("lch1", 20);
		Person p2 = new Person("lch2", 14);
		Person p3 = new Person("lch3", 17);
		TreeSet<Person> t = new TreeSet<>();
		t.add(p1);
		t.add(p2);
		t.add(p3);
		for (Person p : t) {
			System.out.println(p);
		}
		System.out.println();

		TreeSet<Person> ts = new TreeSet<>(new PersonComparator());
		ts.add(p1);
		ts.add(p2);
		ts.add(p3);

		for (Person ps : ts)
			System.out.println(ps);

	}

}
