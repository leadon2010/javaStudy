package classes.inherit;

public class SmartPhone extends DmbCellPhone {
	String appName;

	SmartPhone(String color, String model, String appName) {
		super(color, model, 10);
		this.color = color;
		this.model = model;
		this.appName = appName;
	}

}
