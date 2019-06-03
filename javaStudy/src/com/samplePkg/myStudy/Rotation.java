package com.samplePkg.myStudy;

public class Rotation {
	public static void main(String[] args) {
		int[][] ary = new int[5][5];
		int cnt = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				ary[i][j] = cnt++;
			}
		}

		for (int i = 4; i >= 0; i--) {
			for (int j = 4; j >= 0; j--) {
				System.out.printf("%3d", ary[i][j]);
			}
			System.out.println();
		}
	}
}
