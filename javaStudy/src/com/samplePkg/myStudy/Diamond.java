package com.samplePkg.myStudy;

public class Diamond {
	public static void main(String[] args) {
		int size = 7;
		int pos = size - 1;
		int[][] arr = new int[size][size];
		char chr = 'A';
		int i, j;
		for (i = 0; i <= pos; i++) {
			if (i <= pos / 2) {
				for (j = i; j <= pos - i; j++) {
					arr[i][j] = chr++;
				}

			} else {
				for (j = pos - i; j <= i; j++) {
					arr[i][j] = chr++;
				}
			}
		}
		for (i = 0; i <= pos; i++) {
			for (j = 0; j <= pos; j++) {
				System.out.print((char) arr[i][j] + " ");
			}
			System.out.println();
		}

	}// end of main
}// end of class
