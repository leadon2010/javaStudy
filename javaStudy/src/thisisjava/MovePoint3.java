package thisisjava;

class Driver {
	void drive(Vehicle v) {
		v.run();
	}
}

class Vehicle {
	void run() {
		System.out.println("달린다.");
	}
}

class Bus extends Vehicle {

	@Override
	void run() {
		System.out.println("버스가 달린다.");
	}

}

class Taxi extends Vehicle {
	@Override
	void run() {
		System.out.println("택시가 달린다.");
	}

}

public class MovePoint3 {

	public static void main(String[] args) {
		Bus b = new Bus();
		b.run();
		Taxi t = new Taxi();
		t.run();
		
		Driver d = new Driver();
		d.drive(b);
		d.drive(t);
	}
}
