package classes;

public class UserExample {
	public static void main(String[] args) {
		User u1 = new User("Hong", "reading", 10);
		u1.addBook(new Book("Java", "김자바"));
		u1.addBook(new Book("C++", "김시뿔"));
		u1.addBook(new Book("Python", "김파이"));

		u1.userInfo();
	}
}
