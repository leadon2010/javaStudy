package variablesAndTypes;

public class DataType {
	public static void main(String[] args) {
		byte num1 = 10;
		byte num2 = 20;
		byte num3 = (byte) (num1 + num2);

		long lng1 = 1000000000000L;
		long lng2 = 2000000000000L;
		long lng3 = lng1 + lng2;

		System.out.println(lng3);

		float dbl1 = 1.0001F;
		float dbl2 = 2.0001F;
		float dbl3 = dbl1 + dbl2;
		System.out.println(dbl3);

		char A = 'A';
		A = 66;
		System.out.println(A);

		System.out.println(1235346465465463L);

		System.out.println(3.23234354354545354F);
		System.out.println(3.23234354354545354D);
		System.out.println(3.23234354354545354);

		System.out.println(12 + "\u20AC");

		int num10 = 10;
		double dbl10 = 3.2234;
		System.out.println(num10 + dbl10);

		double PI = 3.14;

		System.out.println((int) PI);

	}
}
