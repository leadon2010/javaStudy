package com.samplePkg;
//90도회전하기
public class Rotate {
	public static void main(String[] args) {
		int a[][] = new int[5][5];
		int b[][] = new int[5][5];
		int row, col;
		int i = 0;
		for (row = 0; row <= 4; row++) {
			for (col = 0; col <= 4; col++) {
				a[row][col] = i++;
			}
		}
		for (row = 0; row <= 4; row++) {
			for (col = 0; col <= 4; col++) {
				System.out.printf("%3d", a[row][col]);
			}
			System.out.println();
		}

		// 90도 회전
		for (row = 0; row <= 4; row++) {
			for (col = 0; col <= 4; col++) {
				b[row][col] = a[col][4 - row];
			}
		}
		// 90도 회전 출력
		System.out.println();
		for (row = 0; row <= 4; row++) {
			for (col = 0; col <= 4; col++) {
				System.out.printf("%3d", b[row][col]);
			}
			System.out.println();
		}
		// 180도 회전
		for (row = 0; row <= 4; row++) {
			for (col = 0; col <= 4; col++) {
				a[row][col] = b[col][4 - row];
			}
		}
		// 180도 회전 출력
		System.out.println();
		for (row = 0; row <= 4; row++) {
			for (col = 0; col <= 4; col++) {
				System.out.printf("%3d", a[row][col]);
			}
			System.out.println();
		}
	}
}