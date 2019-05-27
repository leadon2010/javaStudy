package method;

public class CarSample {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.maxSpeed = 100;
		car1.showMaxSpeed();
		car1.speed = 60;
		car1.start();
		car1.run();
		car1.showSpeed();
		car1.stop();
	}
}
