package interfaces;

public interface RemoteControl {
	//
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	//
	void turnOn();
	void turnOff();
	void setVolume(int volume);

	//
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음처리한다.");
		} else {
			System.out.println("무음해제한다.");
		}
	}
	
	//
	static void changeBattery() {
		System.out.println("건전지를 교환한다.");
	}

}