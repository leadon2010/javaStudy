package com.yedamClass.extendPkg;

class Driver {
	void drive(Vehicle vehicle) {
		vehicle.run();
	}
}

class Vehicle {
	void run() {
		System.out.println("vehicle run");
	}
}

class Bus extends Vehicle {

	@Override
	void run() {
		System.out.println("bus run");
	}
}

class Taxi extends Vehicle {
	@Override
	void run() {
		System.out.println("taxi run");
	}
}

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();

		driver.drive(bus);
		driver.drive(taxi);
		
		// 강제타입변환예제는 ==> ParentExample.java
	}
}
