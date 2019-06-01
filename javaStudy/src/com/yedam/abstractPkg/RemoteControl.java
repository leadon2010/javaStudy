package com.yedam.abstractPkg;

public interface RemoteControl {
	// 상수필드
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	// 추상메소드
	void turnOn();

	void turnOff();

	void setVolume(int volume);

	// 디폴트 메소드
	default void setMute(boolean mute) {
		if (mute)
			System.out.println("muting");
		else
			System.out.println("speaking");
	}

	// 정적 메소드
	static void changeBattery() {
		System.out.println("change battery");
	}

}// end of class
