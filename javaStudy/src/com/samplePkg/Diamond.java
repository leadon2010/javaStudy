package com.samplePkg;

public class Diamond {
	public static void main(String[] main) {
		int array[][] = new int[5][5];
		int row, col;
		char ch = 'A';
		for (row = 0; row <= 4; row++) {
			if (row <= 2) {
				for (col = row; col <= 4 - row; col++) {
					array[row][col] = ch++;
				}
			} else {
				for (col = 4 - row; col <= row; col++) {
					array[row][col] = ch++;
				}
			}
		}
		// 출력
		for (row = 0; row <= 4; row++) {
			for (col = 0; col <= 4; col++) {
				System.out.printf("%3c", array[row][col]);
			}
			System.out.println();
		}
	}
}
