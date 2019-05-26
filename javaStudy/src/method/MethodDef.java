package method;

class Person {
	String name;
	int age;
	double height;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void showPeople() {
		System.out.println("my name is " + this.name);
		System.out.println("I am " + age + " years old.");
		System.out.println("I am " + height + " cm.");
	}

}

public class MethodDef {

	public static void main(String[] args) {

		System.out.println("프로그램의 시작");
		hiEveryOne(12);
		hiEveryOne(13);
		hiEveryOne(25, 180.5);
		byeEveryOne();

		System.out.println("프로그램의 종료");
	}

	static void hiEveryOne(int age) {
		System.out.println("Hi, EveryOne!!");
		System.out.println("My age is : " + age);
	}

	static void hiEveryOne(int age, double height) {
		int math = 70;
		int eng = 85;
		int kor = 90;
		System.out.println("Hi, EveryBody.");
		System.out.println("I am " + age + " old.");
		System.out.println("I am " + height + " cm.");
		System.out.println("my score is " + sumScore(math, eng, kor));
	}

	static void byeEveryOne() {
		System.out.println("See you later.");
	}

	static int sumScore(int m, int e, int k) {
		return (m + e + k);
	}

}
