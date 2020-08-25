package api.object;

public class MembersExample {
	public static void main(String[] args) {
		Members origind = new Members("blue", "Hong", "12345", 25, true);
		Members clond = origind.getMembers();
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
