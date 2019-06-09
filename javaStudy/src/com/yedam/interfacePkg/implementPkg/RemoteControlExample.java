package com.yedam.interfacePkg.implementPkg;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = null;

		rc = new Television();
		rc.turnOn();
		rc.setMute(true);
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);

		// 익명구현 객체 --> RemoteControlExample$1,RemoteControlExample$2 ... 
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
				System.out.println("구현객체의 볼륨은 : " + this.volume);
			}
			
		};

		rc1.turnOn();
		rc1.turnOff();
		
		// 정적메소드 호출		
		RemoteControl.changeBattery();
	}
}
