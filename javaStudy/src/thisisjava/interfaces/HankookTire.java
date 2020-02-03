package thisisjava.interfaces;

public class HankookTire implements Tire {
	int maxRotation;
	int accumulateRotation;
	String location;

	HankookTire(String location, int maxRotation) {
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
		// System.out.println("한국타이어가 굴러갑니다.");
	}

}
