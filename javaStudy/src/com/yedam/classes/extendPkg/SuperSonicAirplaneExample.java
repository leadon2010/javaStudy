package com.yedam.classes.extendPkg;

class Airplane {
	public void land() {
		System.out.println("착륙합니다.");
	}

	public void fly() {
		System.out.println("일반비행을 합니다.");
	}

	public void takeOff() {
		System.out.println("이륙합니다.");
	}
}

class SuperSonicAirplane extends Airplane {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;

	public int flyMode = NORMAL;

	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		} else {
			// Airplane 객체의 fly() 메소드 호출.
			super.fly();
		}

	}
}

public class SuperSonicAirplaneExample {
	public static void main(String[] args) {
		SuperSonicAirplane sa = new SuperSonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SuperSonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SuperSonicAirplane.NORMAL;
		sa.fly();
		sa.land();

		// final 클래스와 final 메소드 ==> 예제없음. final 클래스, 메소드, 필드의 경우 필드는 다른값으로 변경불가. 클래스와
		// 메소드의 경우 상속불가.
		
		// 접근제한자 protected ==> AAA, BBB, CCC, DDD 클래스.
	}
}
