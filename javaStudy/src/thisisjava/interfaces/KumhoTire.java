package thisisjava.interfaces;

public class KumhoTire implements Tire {
	int maxRotation;
	int accumulateRotation;
	String location;

	KumhoTire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	@Override
	public boolean roll() {
		++accumulateRotation;
		if (accumulateRotation < maxRotation) {
			System.out.println(location + " Tire 수명: " + (maxRotation - accumulateRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
		// System.out.println("금호타이어가 굴러갑니다.");
	}

}
