package api.object;

import java.util.Arrays;

public class MemberExample {

	class Car {
		String model;

		Car(String model) {
			this.model = model;
		}
	}

	class Member implements Cloneable {
		public String name;
		public String id;
		public int age;
		public int[] scores;
		public Car car;

		public Member(String id) {
			super();
			this.id = id;
		}

		public Member(String name, int age, int[] scores, Car car) {
			super();
			this.name = name;
			this.age = age;
			this.scores = scores;
			this.car = car;
		}

		@Override
		public int hashCode() {
			return super.hashCode();
		}

		@Override
		public boolean equals(Object obj) {
			if (obj instanceof Member) {
				Member mem = (Member) obj;
				return this.id.equals(mem.id);
			} else
				return false;
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
		MemberExample me = new MemberExample();
		
		MemberExample.Member origind = me.new Member("Hong", 25, new int[] { 90, 90 }, me.new Car("Sonata"));
		Member cloned = origind.getMember();
		origind.scores[0] = 85;
		origind.scores[1] = 85;

		for (int i = 0; i < 2; i++) {
			System.out.println(origind.scores[i]);
		}
		System.out.println("----------------------");

		for (int i = 0; i < 2; i++) {
			System.out.println(cloned.scores[i]);
		}

		String[] names = { "Hong", "Park", "Choi" };
		Arrays.sort(names);
		for (String s : names) {
			System.out.println(s);
		}

		Member m1 = me.new Member("blue");
		Member m2 = me.new Member("blue");
		Member m3 = me.new Member("red");

		if (m1.equals(m2))
			System.out.println("same");
		else
			System.out.println("different");

		if (m1.equals(m3))
			System.out.println("same");
		else
			System.out.println("different");

	}
}
