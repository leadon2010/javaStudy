package com.yedam.abstractPkg;

public class PhoneExample {
	public static void main(String[] args) {
		// Phone phone = new Phone();
		SmartPhone sp = new SmartPhone("nice");
		sp.turnOn();
		sp.internetSearch();
		sp.turnOff();
	}
}
