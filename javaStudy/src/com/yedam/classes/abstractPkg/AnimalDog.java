package com.yedam.classes.abstractPkg;

public class AnimalDog extends Animal {
	public AnimalDog() {
		this.kind = "포유류.";
	}

	@Override
	public void sound() {
		System.out.println("멍멍.");
	}

}
