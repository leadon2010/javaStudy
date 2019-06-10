package com.yedam.classes.tire;

import com.yedam.classes.tire.hankook.SnowTire;
import com.yedam.classes.tire.kumho.BigWideTire;

class Wheel {
	String wheelSize;

	void changeWheel() {
		System.out.println("휠을 교체합니다.");
	}
}

public class TireExample {
	public static void main(String[] args) {
		// 동일한 패키지에 있을 경우에는 import 하지 않아도 됨.
		Wheel wheel = new Wheel();
		wheel.changeWheel();

		// 패키지가 다를 경우에는 해당 경로를 다 표시해야함.
		com.yedam.classes.tire.hankook.SnowTire sTir = new com.yedam.classes.tire.hankook.SnowTire();

		SnowTire sTire = new SnowTire();
		sTire.showType();
		BigWideTire bTire = new BigWideTire();
		bTire.showType();

		// 동일한 클래스를 참조할 경우에는 직접 패키지명과 클래스명을 같이 적어주어야 한다.
		com.yedam.classes.tire.hankook.Tires tires = new com.yedam.classes.tire.hankook.Tires();
		tires.start();
		tires.setVelocity(40);
		System.out.println(tires.currentVelocity() + "km/h 입니다.");

		com.yedam.classes.tire.kumho.Tires tires2 = new com.yedam.classes.tire.kumho.Tires();
		tires2.start();
		tires2.setSpeed(50);
		System.out.println(tires2.currentSpeed() + "km/h 입니다.");

		// 다음 수업은 상속관련... extendPkg.DmbCellPhoneExample.java
		
	}
}