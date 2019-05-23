package operations;

public class Operator {
	public static void main(String[] args) {
		final int MAX_VALUE = 1000;
		// MAX_VALUE = 2000;
		int result, num1, num2;
		result = 0;
		num1 = 10;
		num2 = 20;
		int num3 = 30;
		result = (num1 + num2) * 3 + num3 / 10;
		System.out.println(result);
		System.out.println(num1 % num2);
		System.out.println(7 / 3);
	}
}
