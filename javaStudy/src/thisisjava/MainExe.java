package thisisjava;

class HankookTire extends Tire {

	public HankookTire(String position, int maxRotation) {
		super(position, maxRotation);
	}

	@Override
	boolean roll() {
		accumulatedRotation++;
		if (maxRotation <= accumulatedRotation) {
			System.out.println("HankookTire flat");
			return false;
		} else {
			System.out.println("HankookTire " + (maxRotation - accumulatedRotation) + " 회");
			return true;
		}
	}

}

class KumhoTire extends Tire {

	public KumhoTire(String position, int maxRotation) {
		super(position, maxRotation);
	}

	@Override
	boolean roll() {
		accumulatedRotation++;
		if (maxRotation <= accumulatedRotation) {
			System.out.println("KumhoTire flat");
			return false;
		} else {
			System.out.println("KumhoTire " + (maxRotation - accumulatedRotation) + " 회");
			return true;
		}
	}

}

class Tire {
	String position;
	int maxRotation;
	int accumulatedRotation;

	public Tire(String position, int maxRotation) {
		super();
		this.position = position;
		this.maxRotation = maxRotation;
	}

	boolean roll() {
		accumulatedRotation++;
		if (maxRotation <= accumulatedRotation) {
			System.out.println("flat");
			return false;
		} else {
			System.out.println("Tire " + (maxRotation - accumulatedRotation) + " 회");
			return true;
		}

	}
}

class Car {
	Tire frontLeft;
	Tire frontRight;
	Tire backLeft;
	Tire backRight;

	public Car(Tire frontLeft, Tire frontRight, Tire backLeft, Tire backRight) {
		super();
		this.frontLeft = frontLeft;
		this.frontRight = frontRight;
		this.backLeft = backLeft;
		this.backRight = backRight;
	}

	int run() {
		if (!frontLeft.roll()) {
			stop();
			return 1;
		}
		if (!frontRight.roll()) {
			stop();
			return 2;
		}
		if (!backLeft.roll()) {
			stop();
			return 3;
		}
		if (!backRight.roll()) {
			stop();
			return 4;
		}
		return 0;
	}

	void stop() {
		System.out.println("멈춥니다.");
	}
}

public class MainExe {
	public static void main(String[] args) {

		Car car = new Car(new Tire("frontLeft", 5), new Tire("frontRight", 4), new Tire("backLeft", 6),
				new Tire("backRight", 3));
		int i = 0;
		while (i < 7) {
			int errLocation = car.run();
			switch (errLocation) {
			case 1:
				System.out.println("frontLeft = HankookTire");
				car.frontLeft = new HankookTire("frontLeft", 10);
				break;
			case 2:
				System.out.println("frontRight = KumhoTire");
				car.frontRight = new KumhoTire("frontRight", 13);
				break;
			case 3:
				System.out.println("backLeft = HankookTire");
				car.backLeft = new HankookTire("backLeft", 11);
				break;
			case 4:
				System.out.println("backRight = KumhoTire");
				car.backRight = new KumhoTire("backRight", 14);
				break;
			}
			i++;
			System.out.println("----------------------------");
		}

	}
}
