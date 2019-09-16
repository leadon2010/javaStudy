package referenceType;

public class ArrayExample {
	public static void main(String[] args) {
		int[] intAry = { 1, 2, 3 };
		String[] strAry = { "Hello", "Nice", "Good" };
		System.out.println(intAry[0]);
		System.out.println(strAry[2]);

		intAry = new int[] { 4, 5, 6 };
		strAry = new String[] { "Taxi", "Bux", "Truck" };
		for (int i = 0; i < intAry.length; i++) {
			System.out.print(intAry[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < strAry.length; i++) {
			System.out.print(strAry[i] + " ");
		}
		System.out.println();
		int[] newIntAry = new int[5];
		System.out.println(newIntAry.length);

		char[] newStrAry = new char[26];
		char chr = 65;
		for (int i = 0; i < newStrAry.length; i++) {
			newStrAry[i] = chr++;
		}
		System.out.println();
		for (int i = 0; i < newStrAry.length; i++) {
			System.out.print(newStrAry[i] + " ");
		}
	}

}
