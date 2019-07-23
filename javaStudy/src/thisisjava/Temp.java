package thisisjava;

public class Temp {
	public static void main(String[] args) {
//		AccountExample acc = new AccountExample();
//		acc.execute();
		int[] ansAry = new int[3];
		int[] insAry = new int[3];
		int input = 0;

		for (int i = 0; i < ansAry.length; i++) {
			input = (int) ((Math.random() * 9) + 1);
			if (ansAry[i - 1] != input)
				ansAry[i] = input;

		}
		for (int i = 0; i < ansAry.length; i++) {
			System.out.println(ansAry[i]);
		}

	}
}
