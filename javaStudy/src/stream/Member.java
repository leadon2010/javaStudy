package stream;

public class Member {
	String name;
	int id;

	Member() {
		System.out.println("Member() call.");
	}

	Member(int id) {
		System.out.println("Member(id) call.");
		this.id = id;
	}

	Member(String name, int id) {
		System.out.println("Member(name, id) call.");
		this.name = name;
		this.id = id;
	}
}