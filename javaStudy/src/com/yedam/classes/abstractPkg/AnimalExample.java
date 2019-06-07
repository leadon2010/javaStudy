package com.yedam.classes.abstractPkg;

abstract class Animal {
	public String kind;

	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}

	// 추상메소드 선언.
	public abstract void sound();
}

class Cat extends Animal {
	public Cat() {
		this.kind = "포유류.";
	}

	@Override
	public void sound() {
		System.out.println("야옹.");
	}
}

class Dog extends Animal {
	public Dog() {
		this.kind = "포유류.";
	}

	@Override
	public void sound() {
		System.out.println("멍멍.");
	}
}

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();

		System.out.println("---------------------");
		Animal animal = null;

		animal = new Dog();
		animal.sound();

		animal = new Cat();
		animal.sound();

		System.out.println("---------------------");
		animalSound(new Dog());
		animalSound(new Cat());

	}

	// 매개변수의 다형성.
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
