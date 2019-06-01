package com.yedam.abstractPkg;

public class SmartPhone extends Phone {

	public SmartPhone(String owner) {
		super(owner);
	}

	@Override
	public void turnOn() {
		super.turnOn();
		System.out.println("you are ready to use phone.");
	}

	@Override
	public void turnOff() {
		super.turnOff();
		System.out.println("you stopped phone");
	}

	public void internetSearch() {
		System.out.println("web searching...");
	}
}
