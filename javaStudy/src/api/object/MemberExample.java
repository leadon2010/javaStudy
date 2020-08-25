package api.object;

import java.util.Arrays;

public class MemberExample {
	public static void main(String[] args) {

		Member origind = new Member("Hong", 25, new int[] { 90, 90 }, new Car("Sonata"));
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

		Member m1 = new Member("blue");
		Member m2 = new Member("blue");
		Member m3 = new Member("red");

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
