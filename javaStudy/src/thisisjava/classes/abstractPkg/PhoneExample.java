package thisisjava.classes.abstractPkg;

public class PhoneExample {
	public static void main(String[] args) {
//		Phone phone = new Phone();
		SmartPhone smartPhone = new SmartPhone("nice");
		smartPhone.turnOn(); // Phone class
		smartPhone.internetSearch();
		smartPhone.turnOff(); // Phone class
	}
}
