package com.yedam.abstractPkg;

public abstract class Animal {
	public String kind;

	public void breathe() {
		System.out.println("take a breath");
	}

	public abstract void sound();
}
