package method;

public class MethodExample1 {

	public static void main(String[] args) {
		System.out.println("hello");
		showName();
		showAge(40);
		showMe(175.5, 70.5);
		System.out.println("프로그램 종료.");
	}

	public static void showName() {
		System.out.println("Hello, My name is Charles.");
	}

	public static void showAge(int age) {
		System.out.println("I am " + age + " years old.");
	}

	public static void showMe(double height, double weight) {
		System.out.println("I am " + height + " cm and " + weight + " kg.");
	}

}
