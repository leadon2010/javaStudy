package collections.tree;

public class Person implements Comparable<Person> {
	String name;
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person p) {
		return this.age - p.age; // -1이면 오름차순, 0, 1이면 내림차순.
	}
}
