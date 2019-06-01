package com.yedam.abstractPkg;

public class AnimalDog extends Animal {
	public AnimalDog() {
		this.kind = "mammalia";
	}

	@Override
	public void sound() {
		System.out.println("bow wow");
	}

}
