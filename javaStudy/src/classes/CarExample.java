package classes;

public class CarExample {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.model = "sonata";
		car1.color = "white";
		car1.maxSpeed = 100;

		Car car2 = new Car("grandeur");
		car2.color = "black";
		car2.maxSpeed = 200;

		Car car3 = new Car("BMW", "gray");
		car3.maxSpeed = 300;

		Car[] cars = { car1, car2, car3 };
		for (Car c : cars) {
			System.out.println("model: " + c.model);
		}
		
		System.out.println("end of progs");
	}
}
