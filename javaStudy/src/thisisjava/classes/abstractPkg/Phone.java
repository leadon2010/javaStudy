package thisisjava.classes.abstractPkg;

public abstract class Phone {
	// field
	public String owner;

	// constructor
	public Phone() {
	}

	public Phone(String owner) {
		this.owner = owner;
	}

	// method
	public void turnOn() {
		System.out.println("turn on phone.");
	}

	public void turnOff() {
		System.out.println("turn off phone.");
	}

	public abstract void bell();
}
