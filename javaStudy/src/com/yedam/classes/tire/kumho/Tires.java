package com.yedam.classes.tire.kumho;

public class Tires {
	private int speed;

	public void start() {
		System.out.println("금호타이어: 출발합니다");
	}

	public void roll() {
		System.out.println("금호타이어: 회전기능");
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int currentSpeed() {
		return speed;
	}
}
