package com.yedam.abstractPkg;

public class AnimalCat extends Animal {
	public AnimalCat() {
		this.kind = "mammalia";
	}

	@Override
	public void sound() {
		System.out.println("muew meuw");
	}

}
