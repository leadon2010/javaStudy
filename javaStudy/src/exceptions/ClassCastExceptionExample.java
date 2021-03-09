package exceptions;

abstract class Animal {
	abstract void sound();
}

class Dog extends Animal {
	@Override
	void sound() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal {
	@Override
	void sound() {
		System.out.println("야옹");
	}
}

public class ClassCastExceptionExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		try {
			changeDog(dog);
		} catch (Exception e) {
			e.printStackTrace();
		}

		Cat cat = new Cat();
		changeDog(cat);
	}

	public static void changeDog(Animal animal) {
		if (animal instanceof Dog) {
			Dog dog = (Dog) animal;
			dog.sound();
		} else {
			System.out.println("변경 불가.");
			throw new ClassCastException();
		}
	}
}
