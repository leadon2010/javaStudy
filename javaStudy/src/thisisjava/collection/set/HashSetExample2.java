package thisisjava.collection.set;

import java.util.HashSet;
import java.util.Set;

class Member {
	public String name;
	public int age;

	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

//	@Override
//	public int hashCode() {
//		return this.name.hashCode() + age;
////		return super.hashCode();
//	}
//
//	@Override
//	public boolean equals(Object obj) {
////		return super.equals(obj);
//		Member member = (Member) obj;
//		return (this.name.equals(member.name) && this.age == member.age);
//	}

}

public class HashSetExample2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		set.add(new Member("hong", 10));
		set.add(new Member("hong", 10));

		System.out.println(set.size());
	}
}
