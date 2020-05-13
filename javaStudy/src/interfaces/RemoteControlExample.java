package interfaces;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			int volume;

			@Override
			public void turnOn() {
				System.out.println("익명객체 전원 켬.");
			}

			@Override
			public void turnOff() {
				System.out.println("익명객체 전원 끔.");
			}

			@Override
			public void setVolume(int volume) {
				this.volume = volume;
				System.out.println("볼륨을 " + volume + " 으로 변경.");
			}

		};

		rc.turnOn();
		rc.setVolume(10);
		rc.turnOff();
	}
}
