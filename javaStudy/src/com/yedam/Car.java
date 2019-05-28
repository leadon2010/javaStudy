package com.yedam;

public class Car {
	String company;
	String model;
	String color;
	int maxSpeed;

	Car() {

	}

	Car(String model) {
		this(model, "white", 250); // 생성자의 첫줄에서만 사용을 해야함.
		System.out.println();
	}

	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	public static void main(String[] args) {

		int[] oldAry = { 1, 2, 3 };
		int[] newAry = new int[5];
		for (int i = 0; i < oldAry.length; i++) {
			newAry[i] = oldAry[i];
		}
		for (int i = 0; i < newAry.length; i++) {
			System.out.println(newAry[i]);
		}
		System.out.println("=====================");
		for (int i : newAry) {
			System.out.println(i);
		}

		String[] strAry = { "java", "array", "copy" };
		String[] strAry2 = new String[5];
		System.arraycopy(strAry, 0, strAry2, 0, strAry.length);
		for (String str : strAry2) {
			System.out.println(str);
		}

	}

	static int addSum(int[] ary) {
		int sum = 0;
		for (int i = 0; i < ary.length; i++) {
			sum += ary[i];
		}
		return sum;
	}

}
