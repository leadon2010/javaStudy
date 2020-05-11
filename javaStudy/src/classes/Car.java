package classes;

public class Car {
	String model;
	String color;
	int maxSpeed;

	public Car() {

	}

	public Car(String model) {
		this.model = model;
	}

	public Car(String model, String color) {
		this.model = model;
		this.color = color;
	}

	public Car(String model, String color, int maxSpeed) {
		this(model, color);
		this.maxSpeed = maxSpeed;
	}

}
