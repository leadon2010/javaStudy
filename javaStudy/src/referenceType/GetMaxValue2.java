package referenceType;

public class GetMaxValue2 {
	public static void main(String[] args) {
		exam01();
	}

	public static void exam02() {
		int[] intAry = { 4, 6, 2, 9, 5 };
		int maxValue = 0;
		for (int i = 0; i < intAry.length; i++) {
			if (intAry[i] > maxValue)
				maxValue = intAry[i];
		}
		System.out.println("제일 큰 값은 : " + maxValue);

	}

	public static void exam01() {
		int a = 4, b = 6, c = 2, d = 9, e = 5;
		int maxValue = 0;
		if (a > maxValue)
			maxValue = a;
		if (b > maxValue)
			maxValue = b;
		if (c > maxValue)
			maxValue = d;
		if (d > maxValue)
			maxValue = d;
		if (e > maxValue)
			maxValue = e;
		System.out.println("제일 큰 값은 : " + maxValue);

	}
}
