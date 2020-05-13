package classes.abstract_class;

public class AnimalExample {
	public static void main(String[] args) {
//		Animal animal = new Animal(); // 추상클래스 인스턴스 생성 불가.
		Animal animal = new Bird();
		animal.breathe();
		animal.sound();
		
		Cat cat = new Cat();
		cat.breathe();
		cat.sound();
	}
}
