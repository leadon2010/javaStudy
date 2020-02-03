package thisisjava.interfaces;

class Car {
	Tire frontLeftTire = new HankookTire("앞왼쪽", 5);
	Tire frontRightTire = new HankookTire("앞오른쪽", 6);
	Tire backLeftTire = new KumhoTire("뒤왼쪽", 7);
	Tire backRightTire = new KumhoTire("뒤오른쪽", 6);

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
		return 0;
	}

	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		for (int i = 0; i < 7; i++) {
			int problemLocation = myCar.run();
			switch (problemLocation) {
			case 1:
				System.out.println("앞왼쪽 타이어 교체");
				myCar.frontLeftTire = new HankookTire("앞왼쪽", 10);
				break;
			case 2:
				System.out.println("앞오른쪽 타이어 교체");
				myCar.frontRightTire = new KumhoTire("앞오른쪽", 11);
				break;
			case 3:
				System.out.println("앞왼쪽 타이어 교체");
				myCar.frontRightTire = new KumhoTire("뒤왼쪽", 12);
				break;
			case 4:
				System.out.println("앞오른쪽 타이어 교체");
				myCar.frontRightTire = new KumhoTire("뒤오른쪽", 13);
				break;
			}
			System.out.println("--------------------------------");
		}
	}
}
