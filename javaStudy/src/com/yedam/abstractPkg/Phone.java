package com.yedam.abstractPkg;

public abstract class Phone {
	public String owner;

	public Phone(String owner) {
		this.owner = owner;
	}

	public void turnOn() {
		System.out.println("turn on phone.");
	}

	public void turnOff() {
		System.out.println("turn off phone.");
	}
}
