package classes.abstract_class;

public class AnimalExample {
	public static void main(String[] args) {
//		Animal animal = new Animal(); // 추상클래스 인스턴스 생성 불가.
		Animal animal = new Bird("조류");
		animal.breathe();
		animal.sound();
		animal.showInfo();

		Cat cat = new Cat("포유류");
		cat.breathe();
		cat.sound();
		cat.showInfo();

		final int age = 10;
		if (age > 5) {
//			age = 12;
		}

	}
}

final class LastClass {
	void run() {
		System.out.println("last class");
	}
}

//class FinalClass extends LastClass {
//
//}