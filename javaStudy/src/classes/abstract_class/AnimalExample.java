package classes.abstract_class;

public class AnimalExample {
	public static void main(String[] args) {
//		Animal animal = new Animal(); // 추상클래스 인스턴스 생성 불가.
		Animal animal = new Bird("조류");
		animal.breathe();
		animal.sound();
		animal.showInfo();

		Cat cat = new Cat("포유류");
		cat = new Cat("포유류");
		cat.breathe();
		cat.sound();
		cat.showInfo();
		System.out.println("----------------------");

		// 변수의 다형성을 ...
		animalSound(animal);
		animalSound(cat);

		// final 변수 일 경우에도 값을 변경할 수 없다.
		final int age = 10;
		if (age > 5) {
//			age = 12;
		}

	}

	public static void animalSound(Animal animal) {
		animal.sound();
	}
}

// final 인 경우에는 상속이 안된다.
final class LastClass {
	void run() {
		System.out.println("last class");
	}
}

//class FinalClass extends LastClass {
//
//}