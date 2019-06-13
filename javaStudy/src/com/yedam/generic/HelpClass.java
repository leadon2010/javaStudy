package com.yedam.generic;

class Apple {

}

class Tv {

}

class Car {
	public void running() {
		System.out.println("car run");
	}
}

class Animal {
	public static Animal animal = new Animal();

	public Animal getType() {
		return animal;
	}

	public void run() {
		System.out.println("running...");
	}
}

class Dog extends Animal {

}

class Cat extends Animal {

}

public class HelpClass {

}
