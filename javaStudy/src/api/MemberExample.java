package api;

public class MemberExample {
	public static void main(String[] args) {
		Member original = new Member("user1", "Hong", "12345", 25, new int[] { 90, 90 }, new Car("Audi"));
		Member cloned = original.getMember();
		cloned.password = "67890";
		cloned.scores[0] = 95;
		cloned.car.model = "BMW";

		System.out.println("[원본]");
		System.out.println(original.toString());
		System.out.println("[복사본]");
		System.out.println(cloned.toString());

//		Member origin = new Member("user2", "Park", new int[] {80, 80}, new Car("Audi"));

	}
}
