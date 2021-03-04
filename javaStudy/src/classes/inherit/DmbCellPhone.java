package classes.inherit;

public class DmbCellPhone extends CellPhone {
	int channel;

	DmbCellPhone(String color, String model, int channel) {
		this.color = color;
		this.model = model;
		this.channel = channel;
	}

	void turnOnDmb() {
		System.out.println("채널: " + channel + "번 방송 수신을 시작합니다");
	}

	void changeChannel(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다");
	}

	void turnOffDmb() {
		System.out.println("방송 수신을 종료합니다");
	}
}
