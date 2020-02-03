package thisisjava.referenceType;

import java.util.Scanner;

public class GetMaxValue {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 값 입력:");
		int a = sc.nextInt();
		System.out.println("두번째 값 입력:");
		int b = sc.nextInt();
		int maxValue;

		if (a > b) {
			maxValue = a;
		} else {
			maxValue = b;
		}
		maxValue = (a > b ? a : b);
		System.out.println(maxValue);
		sc.close();

		int[] maxAry = { 3, 8, 5, 6, 7 };
		maxValue = 0;
		for (int i = 0; i < maxAry.length; i++) {
			maxValue = maxAry[i] > maxValue ? maxAry[i] : maxValue;
		}
		System.out.println(maxValue);

	}

}
