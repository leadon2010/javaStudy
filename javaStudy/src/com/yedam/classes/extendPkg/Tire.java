package com.yedam.classes.extendPkg;

public class Tire {

	public int maxRotation;  // 사용가능한 회전수.
	public int accumulateRotation; // 현재 사용한 회전수.
	public String location; // 장착위치...왼쪽,오른쪽,앞,뒤

	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	public boolean roll() {
		++accumulateRotation;
		if (accumulateRotation < maxRotation) {
			System.out.println(location + " Tire 수명: " + (maxRotation - accumulateRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	}
}
