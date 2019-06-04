package com.yedam.extendPkg;

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

		// DmbCellPhone 의 메소드 호출
		dphone.turnOnDmb();
		dphone.changeChannelDmb(14);
		dphone.turnOffDmb();

		/*
		 *  예제1) Vehicle 클래스와 상속받는 Bus 클래스를 생성.
		 *  필드: engine, handle, tire + busNo, busCompany
		 *  메소드: start(), run(), stop() + checkCard(), bell()
		 */
	}
}
