package com.yedam.classes.nested;

public class AnonymousInterfaceExample {
	public static void main(String[] args) {
		AnonymousInterface anony = new AnonymousInterface();
		anony.field.turnOn();
		anony.field.turnOff();

		anony.method1();

		anony.method2(new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("SmartTV를 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("SmartTV를 끕니다.");
			}

		});
	}

}
