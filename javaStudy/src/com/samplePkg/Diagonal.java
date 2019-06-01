package com.samplePkg;

//대각선채우기
public class Diagonal {
	public static void main(String[] args) {
		int array[][] = new int[5][5];
		int[][] arr = new int[5][5];
		int cnt;
		int i = 1;
		int row, col;
		for (cnt = 0; cnt <= 8; cnt++) {
			for (row = 0; row <= 4; row++) {
				col = cnt - row;
				if (col >= 0 && col <= 4) {
					array[row][col] = i++;
				}
			}
		}
		for (row = 0; row <= 4; row++) {
			for (col = 0; col <= 4; col++) {
				System.out.printf("%3d", array[row][col]);
			}
			System.out.println();
		}
	}// main end
}
