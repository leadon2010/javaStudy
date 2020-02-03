package thisisjava.generic.test;

public class Animal {
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
