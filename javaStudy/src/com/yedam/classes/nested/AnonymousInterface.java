package com.yedam.classes.nested;

interface RemoteControl {
	public void turnOn();
	public void turnOff();
}

public class AnonymousInterface {

	RemoteControl field = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}

		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
	};

	void method1() {
		RemoteControl localVar = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("Audio를 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다.");
			}

		};
		localVar.turnOn();
		localVar.turnOff();
	}

	void method2(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	};
}
