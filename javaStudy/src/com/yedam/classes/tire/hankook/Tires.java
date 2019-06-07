package com.yedam.classes.tire.hankook;

public class Tires {
	private int velocity;

	public void start() {
		System.out.println("한국타이어: 출발합니다");
	}

	public void roll() {
		System.out.println("한국타이어: 회전기능");
	}

	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}

	public int currentVelocity() {
		return velocity;
	}
}
