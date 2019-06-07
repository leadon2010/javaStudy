package com.yedam.classes.extendPkg;

class Driver {
	void drive(Vehicle vehicle) {
		vehicle.run();
	}
}

class Vehicle {
	String engine;
	String handle;
	Tire tire;

	void start() {
		System.out.println("차가 출발합니다.");
	}

	void run() {
		System.out.println("차가 달립니다.");
	}

	void stop() {
		System.out.println("차가 정차합니다.");
	}
}

class Bus extends Vehicle {
	String busNo;

	@Override
	void run() {
		System.out.println("버스가 달립니다.");
	}
}

class Taxi extends Vehicle {
	String taxiNo;

	@Override
	void run() {
		System.out.println("택시가 달립니다.");
	}
}

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();

		// 매개변수의 다형성.
		driver.drive(bus);
		driver.drive(taxi);

		// 강제타입변환예제는 ==> ParentExample.java
	}
}
