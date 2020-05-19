package exceptions;

public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {
		int[] intAry = new int[5];

		for (int i = 0; i <= 5; i++) {
			try {
				intAry[i] = i;
				System.out.println(i);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 범위를 초과했습니다. intAry[" + i + "]");
			}
		}

		System.out.println("end of program.");
	}
}
