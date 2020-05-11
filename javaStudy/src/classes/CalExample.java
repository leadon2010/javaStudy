package classes;

public class CalExample {
	public static void main(String[] args) {
		Cal c1 = new Cal();

		c1.powerOn();
		double result1 = c1.divide(10, 5);
		int result2 = c1.multi(3, 7);
		
		double result3 = c1.divide(20, 4) + c1.multi(3, 7);

		System.out.println(result1 + result2 + result3);

	}
}
