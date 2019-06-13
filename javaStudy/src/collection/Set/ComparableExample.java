package collection.Set;

import java.util.Iterator;
import java.util.TreeSet;

class Person implements Comparable<Person> {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person o) {
		if (this.age < o.age)
			return -1;
		else if (this.age > o.age)
			return 1;
		else
			return 0;
//		return this.age - o.age;
	}

}

public class ComparableExample {
	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<>();
		treeSet.add(new Person("홍길동", 45));
		treeSet.add(new Person("박문수", 30));
		treeSet.add(new Person("갑순이", 35));
		treeSet.add(new Person("김갑수", 15));

		Iterator<Person> iterator = treeSet.iterator();

		while (iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person.name + " - " + person.age);
		}

	}
}
