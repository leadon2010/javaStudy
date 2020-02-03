package thisisjava.classes.abstractPkg;

public class PhoneExample {
	public static void main(String[] args) {
		// Phone phone = new Phone();
		Phone phone = new SmartPhone("nice"); // 자동형변환
		phone.turnOn();
		SmartPhone smartPhone = (SmartPhone) phone; // 강제형변환
		smartPhone.internetSearch();
		phone.turnOff();
	}
}
