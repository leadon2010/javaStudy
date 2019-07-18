package thisisjava;

public class Variables {
	public static void main(String[] args) {
		byte var1 = 125;
		int var2 = 125;
//		for (int i = 0; i < 10; i++) {
//			System.out.print("byte: " + var1++ + ", int: " + var2++ + "\n");
//		}
		int result = (byte) (var1 + 3);
		System.out.println(result);

		double dValue = (3.0 / 2);
		System.out.println(dValue);

		System.out.println(Byte.MIN_VALUE + ", " + Byte.MAX_VALUE);
		System.out.println(Short.MIN_VALUE + ", " + Short.MAX_VALUE);

		System.out.println(Float.MIN_VALUE + ", " + Float.MAX_VALUE);
		System.out.println(Double.MIN_VALUE + ", " + Double.MAX_VALUE);
		System.out.println("----------------------");

		int num1, num2;
		num1 = num2 = 123456780;

		double num3 = num2;
		System.out.println(num3);
		num2 = (int) num3;
		System.out.println(num2);

		System.out.println(num1 - num2);

		decimalTobinary(125);

	}

	// 10진수를 2진수로 바꾸는 함수
	static void decimalTobinary(int a) {
		String result = "";
		int m = 0;
		for (int i = a; i > 0;) {
			m = i % 2;
			result = m + result;
			i /= 2;
		}
		System.out.println("십진수 " + a + "는 이진수 " + result + " 입니다.");
//		int r = result.length();
//		String newResult = "";
//		for (int i = r; i > 0;) {
//			i--;
//			newResult += result.charAt(i);
//		}
//		System.out.println("십진수 " + a + "는 이진수 " + newResult + " 입니다.");
	}
}
