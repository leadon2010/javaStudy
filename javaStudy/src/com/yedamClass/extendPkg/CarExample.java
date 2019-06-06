package com.yedamClass.extendPkg;

import com.yedamClass.tire.Tire;
import com.yedamClass.tire.hankook.HankookTire;

class Car {

	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);
	// Tire[] tires = { new Tire("앞왼쪽", 6), new Tire("앞오른쪽", 2), new Tire("뒤왼쪽", 3),
	// new Tire("뒤오른쪽", 4) };

	int run() {
		System.out.println("[자동차 달립니다.]");
		if (frontLeftTire.roll() == false) {
			stop();
			return 1;
		}
		if (frontRightTire.roll() == false) {
			stop();
			return 2;
		}
		if (backLeftTire.roll() == false) {
			stop();
			return 3;
		}
		if (backRightTire.roll() == false) {
			stop();
			return 4;
		}
//		for (int i = 0; i < 4; i++) {
//			if (tires[i].roll() == false) {
//				stop();
//				return i + 1;
//			}
//		}
		return 0;
	}

	void stop() {
		System.out.println("[자동차가 엄춥니다.]");
	}
}

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		for (int i = 1; i <= 5; i++) {
			int problemLocation = car.run();

			switch (problemLocation) {
			case 1:
				System.out.println("앞왼쪽 HankookTire로 교체");
				car.frontLeftTire = new HankookTire("앞왼쪽", 15);
				// car.tires[0] = new HankookTire("앞왼쪽", 15);
				break;
			case 2:
				System.out.println("앞오른쪽 KumhoTire로 교체");
				car.frontRightTire = new HankookTire("앞오른쪽", 13);
				// car.tires[1] = new HankookTire("앞오른쪽", 13);
				break;
			case 3:
				System.out.println("뒤왼쪽 HankookTire로 교체");
				car.backLeftTire = new HankookTire("뒤왼쪽", 14);
				// car.tires[2] = new HankookTire("뒤왼쪽", 14);
				break;
			case 4:
				System.out.println("뒤오른쪽 KumhoTire로 교체");
				car.backRightTire = new HankookTire("뒤오른쪽", 17);
				// car.tires[3] = new HankookTire("뒤오른쪽", 17);
				break;
			}
			System.out.println("---------------------------------------------");
		}
	}
}
