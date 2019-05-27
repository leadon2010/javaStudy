package yoon.ch25;

enum Person3 {
	MAN(29), WOMAN(25);

	int age;

	private Person3(int i) {
		this.age = i;
	}

	@Override
	public String toString() {
		return "I am " + age + " years old";
	}
}

public class EnumParaConstructor {
	public static void main(String[] args) {
		System.out.println(Person3.MAN);
		// Person3 p3 = new Person3();// 인스턴스화를 할 수 없다.
	}
}
