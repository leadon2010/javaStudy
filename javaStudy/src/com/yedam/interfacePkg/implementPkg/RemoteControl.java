package com.yedam.interfacePkg.implementPkg;

public interface RemoteControl {
	// 상수필드
	public static final int MAX_VOLUME = 10; // public static final 의미가 숨겨져 있다.
	int MIN_VOLUME = 0; // 생략하더라도 public static final의 의미가 있다.

	// 추상메소드
	public abstract void turnOn();

	void turnOff(); // 생략이 되더라도 public abstract 가 있는 것과 동일함.

	void setVolume(int volume);

	// 디폴트 메소드
	default void setMute(boolean mute) {  // public 이 선언된 특성.
		if (mute)
			System.out.println("무음처리합니다.");
		else
			System.out.println("무음해제합니다.");
	}

	// 정적 메소드
	static void changeBattery() {  // public의 특성.
		System.out.println("건전지를 교체합니다.");
	}

}// end of class
