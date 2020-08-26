package api.object;

public class MembersExample {

	class Member implements Cloneable {
		String id;
		String name;
		String password;
		int age;
		boolean adult;

		public Member(String id, String name, String password, int age, boolean adult) {
			super();
			this.id = id;
			this.name = name;
			this.password = password;
			this.age = age;
			this.adult = adult;
		}

		public Member getMember() {
			Member mem = null;
			try {
				mem = (Member) clone();
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
			return mem;
		}

	}

	public static void main(String[] args) {
		MembersExample me = new MembersExample();
		MembersExample.Member origind = me.new Member("blue", "Hong", "12345", 25, true);

		Member clond = origind.getMember();
		clond.password = "22222";

		System.out.println("id: " + clond.id);
		System.out.println("name: " + clond.name);
		System.out.println("password: " + clond.password);
		System.out.println("age: " + clond.age);
		System.out.println("adult: " + clond.adult);
		System.out.println("--------------------");

		System.out.println("id: " + origind.id);
		System.out.println("name: " + origind.name);
		System.out.println("password: " + origind.password);
		System.out.println("age: " + origind.age);
		System.out.println("adult: " + origind.adult);

	}
}
