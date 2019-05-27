package method;

class Body {
	String modelNo;
	int width;
	int height;
	int length;
}

class Engine {
	String engineNo;
}

class Tire {
	int width;
	int round;
	String tireCompany;
}

public class Car {
	// 고유데이터
	String company;
	String model;
	String color;
	int maxSpeed;

	// 상태
	int speed;
	int rpm;

	// 부품
	Body body;
	Engine engine;
	Tire tire;

	// 기능
	void start() {
		System.out.println("출발합니다.");
	}

	void run() {
		System.out.println("주행중입니다.");
	}

	void gearChange() {
		System.out.println("기어를 변속합니다.");
	}

	void stop() {
		System.out.println("정지합니다.");
	}

	void showSpeed() {
		System.out.println("현재 속도는 " + speed + " 입니다.");
	}

	void showMaxSpeed() {
		System.out.println("최대 속도는 " + maxSpeed + " 입니다.");
	}
}
