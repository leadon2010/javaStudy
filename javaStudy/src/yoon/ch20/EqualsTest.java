package yoon.ch20;

import java.util.Arrays;

class INum {
	private int num;

	INum(int n) {
		num = n;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

}

public class EqualsTest {
	public static void main(String[] args) {
		INum num1 = new INum(10);
		INum num2 = new INum(12);
		INum num3 = new INum(10);

		INum[] arr1 = { num1, num2, num3 };
		INum[] arr2 = Arrays.copyOf(arr1, arr1.length);

		int numb1 = 10;
		int numb2 = 5;
		if ((numb1 == 10 ? numb2 == 5 : numb2 == 20))
			System.out.println("hhh");
		else
			System.out.println("ttt");
	}
}
