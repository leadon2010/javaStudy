package com.yedam.interfacePkg.implementPkg;

public interface RemoteControl {
	// 상수필드
	public static final int MAX_VOLUME = 10; // static final 의미가 숨겨져 있다.
	int MIN_VOLUME = 0;

	// 추상메소드
	void turnOn();

	void turnOff();

	void setVolume(int volume);

	// 디폴트 메소드
	default void setMute(boolean mute) {
		if (mute)
			System.out.println("무음처리합니다.");
		else
			System.out.println("무음해제합니다.");
	}

	// 정적 메소드
	static void changeBattery() {
		System.out.println("건전지를 교화합니다.");
	}

}// end of class
