package lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

class Member2 {
	private String name;
	private String id;

	public Member2() {
		System.out.println("Member() call.");
	}

	public Member2(String id) {
		System.out.println("Member(String id) call.");
		this.id = id;
	}

	public Member2(String name, String id) {
		System.out.println("Member(String name, String id) call.");
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", id=" + id + "]";
	}

}

public class ConstructorReferencesExample {
	public static void main(String[] args) {
		Function<String, Member2> function1 = Member2::new;
		Member2 member1 = function1.apply("angel");
		System.out.println(member1);

		BiFunction<String, String, Member2> function2 = Member2::new;
		Member2 member2 = function2.apply("천사", "anger");
		System.out.println(member2);
	}// end of main
}
