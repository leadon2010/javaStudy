package method;

public class CarSonata {
	public static void main(String[] args) {
		Car sonata = new Car();
		sonata.maxSpeed = 100;
		sonata.showMaxSpeed();
		sonata.speed = 60;
		sonata.start();
		sonata.run();
		sonata.showSpeed();
		sonata.stop();
	}
}
