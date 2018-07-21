package myStudy;

public class Rotate {
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int[][] brr = new int[5][5];
		int a = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++)
				arr[i][j] = a++;
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++)
				System.out.printf("%3d", arr[i][j]);
			System.out.println();
		}
		System.out.println("90도 회전");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				brr[4 - j][i] = arr[i][j];
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++)
				System.out.printf("%3d", brr[i][j]);
			System.out.println();
		}
		System.out.println("180도 회전");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				brr[4 - i][4 - j] = arr[i][j];
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++)
				System.out.printf("%3d", brr[i][j]);
			System.out.println();
		}
		System.out.println("270도 회전");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				brr[j][4 - i] = arr[i][j];
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++)
				System.out.printf("%3d", brr[i][j]);
			System.out.println();
		}
	}// end of main
}// end of class
