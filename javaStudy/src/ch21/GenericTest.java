package ch21;

class Person<T> {
	private T obj;

	Person(T o) {
		obj = o;
	}

	void set(T o) {
		obj = o;
	}

	T get() {
		return obj;
	}

	@Override
	public String toString() {
		return "Person [obj=" + obj + "]";
	}

}

public class GenericTest {
	public static void main(String[] args) {
		Person<String> p = new Person<>();
		p.set("Stringlllll");
		System.out.println(p.get());

		Person<Integer> i = new Person<>();
		i.set(new Integer(3));
		System.out.println(i);
		
		Person[] prr = new Person[3];
		Person<String> ps = new Person<>("String");
		Person<Integer> pi=new Person<>(3);
		Person<>
	}
}
