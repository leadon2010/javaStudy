package thisisjava;

public class Temp {

	public static void main(String[] args) {
		int[] firstAry = new int[5];
		int[] secondAry = new int[5];
		int[] thirdAry = new int[5];

		int a = 0;
		for (int i = 0; i < firstAry.length; i++) {
			firstAry[i] = ++a;
		}
		for (int i = 0; i < secondAry.length; i++) {
			secondAry[i] = ++a;
		}
		for (int i = 0; i < thirdAry.length; i++) {
			thirdAry[i] = ++a;
		}

		for (int j = 0; j < firstAry.length; j++) {
			System.out.print(firstAry[j] + " ");
		}
		System.out.println();
		for (int j = 0; j < secondAry.length; j++) {
			System.out.print(secondAry[j] + " ");
		}
		System.out.println();
		for (int j = 0; j < thirdAry.length; j++) {
			System.out.print(thirdAry[j] + " ");
		}
		System.out.println();

		System.out.println("=================================");

		int[][] fourthAry = new int[3][5];
		for (int i = 0; i < fourthAry.length; i++) {
			for (int j = 0; j < fourthAry[i].length; j++) {
				fourthAry[i][j] = ++a;
			}
		}

		for (int i = 0; i < fourthAry.length; i++) {
			for (int j = 0; j < fourthAry[i].length; j++) {
				System.out.print(fourthAry[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("=================================");

	}

	static void ary() {
		int[] intAry = new int[5];
		for (int i = 0; i < intAry.length; i++) {
			System.out.println(intAry[i]);
		}
		intAry = new int[] { 10, 20, 30, 40, 50 };
		System.out.println("ary length: " + intAry.length);
		intAry = new int[] { 2, 3, 4 };
		System.out.println("ary length: " + intAry.length);
		System.out.println(intAry);

		String[] strAry = { "hi", "my", "name", "is", "lch" };
		for (String str : strAry) {
			System.out.println(str);
		}
	}

	static void gugudan() {
		int i = 1;
		while (i < 10) {
			int j = 2;
			while (j < 10) {
				if (j >= i)
					System.out.printf("%d * %d = %2d  ", j, i, j * i);
				else
					System.out.print("            ");
				j += 2;
			}
			i++;
			System.out.println();
		}

	}
}
