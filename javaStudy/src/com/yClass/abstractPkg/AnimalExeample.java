package com.yClass.abstractPkg;

public class AnimalExeample {
	public static void main(String[] args) {
		AnimalDog dog = new AnimalDog();
		AnimalCat cat = new AnimalCat();
		dog.sound();
		cat.sound();
		System.out.println("---------------------");

		Animal animal = null;
		
		animal = new AnimalDog();
		animal.sound();
		animalSound(animal);

		animal = new AnimalCat();
		animal.sound();
		animalSound(animal);

	}

	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
