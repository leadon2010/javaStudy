package api.system;

public class SystemTimeExample {
	public static void main(String[] args) {

		long time1 = System.nanoTime();
		int sum = 0;
		for (int i = 0; i < 100000; i++) {
			sum += i;
		}
		long time2 = System.nanoTime();
		System.out.println("합: " + sum);
		System.out.println((time2 - time1) + " 초가 걸립니다.");
	}
}
