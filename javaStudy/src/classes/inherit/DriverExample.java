package classes.inherit;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();

		Bus bus = new Bus();
		Taxi taxi = new Taxi();

		Vehicle vehicle = taxi;
		driver.drive(vehicle);
	}
}
