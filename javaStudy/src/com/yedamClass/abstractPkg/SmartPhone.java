package com.yedamClass.abstractPkg;

public class SmartPhone extends Phone {

	public SmartPhone(String owner) {
		super(owner);
	}

	@Override
	public void turnOn() {
		super.turnOn();
		System.out.println("전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		super.turnOff();
		System.out.println("전원을 끕니다.");
	}

	public void internetSearch() {
		System.out.println("웹서치 합니다.");
	}
}
