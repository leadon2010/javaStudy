package com.yedam.extend;

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
		Bus b1 = new Bus();
		Taxi t1 = new Taxi();
		Vehicle v1 = b1;
		Vehicle v2 = t1;
		driver.drive(v1);
		driver.drive(v2);
	}
}
