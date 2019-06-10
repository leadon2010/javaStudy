package com.yedam.classes.extendPkg;

// 부모클래스의 기능을 활용할 수 있다.
class CellPhone {
	// 필드
	String model;
	String color;

	// 생성자
	public CellPhone() {
		super();
	}

	public CellPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}

	// 메소드
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}

	void powerOff() {
		System.out.println("전원을 끕니다.");
	}

	void bell() {
		System.out.println("벨이 울립니다.");
	}

	void sendVoices(String message) {
		System.out.println("자신: " + message);
	}

	void receiveVoices(String message) {
		System.out.println("상대방: " + message);
	}

	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}

	// 접근지시자가 private 일 경우에는 상속의 대상에서 제외된다.
	private void folder() {
		System.out.println("폴더기능");
	}

	protected void antenna() {
		folder(); // 동일한 클래스에서는 private 접근제어자일 경우에도 접근가능함.
		System.out.println("안테나 기능");
	}
}

// 자식클래스는 부모클래스 + 자신의 고유한 기능을 가진다.
class DmbCellPhone extends CellPhone {
	// 자식클래스의 필드
	int channel;

	// 자식클래스의 생성자
	DmbCellPhone() {
		super();
	};

	DmbCellPhone(String model, String color, int channel) {
		super(model, color); // 부모생성자 호출은 super(). 생성자의 위치는 첫줄에 있어야 한다.
		this.channel = channel;
	}

	// 자식클래스의 메소드
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}

	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + " 번으로 바꿉니다.");
	}

	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}

public class DmbCellPhoneExample {
	public static void main(String[] args) {

		DmbCellPhone dphone = new DmbCellPhone("김자바", "검정", 10);

		// CellPhone으로 부터 상속받은 필드
		System.out.println("모델: " + dphone.model);
		System.out.println("색상: " + dphone.color);

		// DmbCellPhone 의 필드
		System.out.println("채널: " + dphone.channel);

		// CellPhone으로부터 상속받은 메소드 호출
		dphone.powerOn();
		dphone.bell();
		dphone.sendVoices("여보세요");
		dphone.receiveVoices("안녕하세요. 저는 홍길동인데요");
		dphone.sendVoices("반갑습니다.");
		dphone.hangUp();
		// dphone.folder(); // 상속을 받을 수 없다.
		dphone.antenna();

		// DmbCellPhone 의 메소드 호출
		dphone.turnOnDmb();
		dphone.changeChannelDmb(14);
		dphone.turnOffDmb();

		//
		// 예제1) Vehicle 클래스와 상속받는 Bus 클래스를 생성. 필드: engine, handle, tire + busNo,
		// busCompany 메소드: start(), run(), stop() + checkCard(), bell()
		// taxi 메소드: ....
		// 다형성에 대해서 설명할 때 사용합니다.

		// 메소드 재정의 (@Override) & 부모메소드 호출 ==> ComputerExample.java, SuperSonicAirplane.java
	}
}