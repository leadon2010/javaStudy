package thisisjava;

import java.util.TreeSet;

public class Temp {
	public static void main(String[] args) {
		int maxValue = 0;
		int[] intAry = { 2, 5, 9, 7, 5 };
		for (int i = 0; i < intAry.length; i++) {
			if (maxValue < intAry[i])
				maxValue = intAry[i];
		}

		System.out.println("최대값은 " + maxValue);
	}
}
