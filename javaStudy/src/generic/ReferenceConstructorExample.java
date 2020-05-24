package generic;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ReferenceConstructorExample {
	public static void main(String[] args) {
		Function<String, Member> func1 = Member::new;

		Member m1 = func1.apply("angel");
		System.out.println(m1.getId());

		BiFunction<String, String, Member> func2 = Member::new;

		Member m2 = func2.apply("Hello", "World");
		System.out.println(m2.getId() + " , " + m2.getName());

	}
}

class Member {
	private String name;
	private String id;

	Member(String id) {
		this.id = id;
		System.out.println("Member(String id) call.");
	}

	Member(String name, String id) {
		this.name = name;
		this.id = id;
		System.out.println("Member(String name, String id) call.");
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

}