package interfaces;

public class SmartTelevision implements RemoteControl, Searchable {
	int volume;

	@Override
	public void search(String url) {
		System.out.println(url + " 을 검색합니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("SmartTV 전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("SmartTV 전원을 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		System.out.println("SmartTV " + volume + " 변경.");
	}
}
