package exceptions;

public class NumberFormatExceptionExample {
	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "100a";

		try {
			int val1 = Integer.parseInt(data1);
			int val2 = Integer.parseInt(data2);
			int result = val1 + val2;
			System.out.println(data1 + " + " + data2 + " = " + result);
		} catch (NumberFormatException e) {
			System.out.println("number format 예외 발생.");
		}
		System.out.println("end of program.");
	}
}
