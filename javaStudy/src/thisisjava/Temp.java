package thisisjava;


public class Temp {

	public static void main(String[] args) {

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
