package com.yedam.classes.abstractPkg;

public class AnimalCat extends Animal {
	public AnimalCat() {
		this.kind = "포유류.";
	}

	@Override
	public void sound() {
		System.out.println("야옹.");
	}

}
