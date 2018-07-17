package testSample;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Diagonal2 {
	public static void main(String[] args) {
		Scanner scan = null;
		int deg;
		while (true) {
			scan = new Scanner(System.in);
			try {
				System.out.print("대각선의 차수를 입력하세요. : ");
				deg = scan.nextInt();
				break;
			} catch (InputMismatchException ex) {
				System.err.println(ex);
			}
		}
		scan.close();
		int array[][] = new int[deg][deg];
		int cnt;
		int i = 1;
		int row, col;
		for (cnt = 0; cnt <= (deg * 2) - 1; cnt++) {
			for (row = 0; row <= deg - 1; row++) {
				col = cnt - row;
				if (col >= 0 && col <= deg - 1) {
					array[row][col] = i++;
				}
			}
		}
		for (row = 0; row <= deg - 1; row++) {
			for (col = 0; col <= deg - 1; col++) {
				System.out.printf("%3d", array[row][col]);
			}
			System.out.println();
		}
	}// main end
}
