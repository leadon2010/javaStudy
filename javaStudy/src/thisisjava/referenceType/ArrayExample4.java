package thisisjava.referenceType;

public class ArrayExample4 {
	public static void main(String[] args) {
		int[] oldAry = { 2, 3, 4 };
		int[] newAry = new int[5];

		for (int i = 0; i < newAry.length; i++) {
			System.out.print(newAry[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < oldAry.length; i++) {
			newAry[i] = oldAry[i];
		}

		for (int i = 0; i < newAry.length; i++) {
			System.out.print(newAry[i] + " ");
		}
		System.out.println();
		System.out.println();

		// System.arraycopy()
		String[] oldStr = { "java", "array", "copy" };
		String[] newStr = new String[5];
		for (int i = 0; i < newStr.length; i++) {
			System.out.println(newStr[i]);
		}
		System.out.println();
		System.arraycopy(oldStr, 0, newStr, 0, 3);

		for (int i = 0; i < newStr.length; i++) {
			System.out.println(newStr[i]);
		}
		System.out.println();

		// enhanced for
		int[] scores = { 50, 60, 70, 80, 90 };
		for (int score : scores) {
			System.out.println(score);
		}
	}

}
