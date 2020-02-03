package thisisjava.exception;

// Integer.parseInt(String s) -> 주어진 문자열을 정수로 변환.
// Double.parseDouble(String s) -> 주어진 문자열을 실수로 변환.
public class NumberFormatExceptionExample {
	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";

		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2); // NumberFormatException 발생.

		int result = value1 + value2;
		System.out.println(data1 + " + " + data2 + " = " + result);

	}
}
