package com.yedam.abstractPkg;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = new Television();
		rc.turnOn();
		rc = new Audio();
		rc.turnOn();

		RemoteControl rc1 = new RemoteControl() {
			private int volume;

			@Override
			public void turnOn() {
				System.out.println("익명구현객체를 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("익명구현객체를 끕니다.");
			}

			@Override
			public void setVolume(int volume) {
				this.volume = volume;
			}
		};

		rc1.turnOn();
		rc1.turnOff();
	}
}
