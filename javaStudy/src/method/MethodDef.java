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
		System.out.println("I am " + height + " tall.");
	}

}

public class MethodDef {

	int speed = 0;
	String carName = "BMW";

	public static void main(String[] args) {

		MethodDef md = new MethodDef();
		md.speed = 10;
		System.out.println(md.carName);

		System.out.println("프로그램의 시작");
		hiEveryOne(12);
		hiEveryOne(13);
		hiEveryBody(25, 180.5);

		Person p1 = new Person();
		p1.setAge(30);
		p1.setHeight(177.5);
		p1.setName("James");
		// p1.showPeople();

		System.out.println("프로그램의 종료");
	}

	static void hiEveryOne(int age) {
		System.out.println("Hi, EveryOne!!");
		System.out.println("My age is : " + age);
	}

	static void hiEveryBody(int age, double height) {
		System.out.println("Hi, EveryBody.");
		System.out.println("I am " + age + " old.");
		System.out.println("I am " + height + " cm.");
		System.out.println("my score is " + sumScore(60, 70, 80));
	}

	static int sumScore(int math, int eng, int kor) {
		return (math + eng + kor);
	}
}
