package thisisjava.newp;

import java.util.Scanner;

public class RamdomXy {

	int k;
	int n;

	public int[] ramdomvalue() {
		// n을 입력 받아서 n1부터 ni까지의 (x,y)값을 출력
		Scanner in = new Scanner(System.in);
		System.out.println("K를 입력 해라 ");
		k = in.nextInt();
		System.out.println("n을 입력 해라");
		n = in.nextInt();

		int yval[] = new int[n + 1]; // n자리 수가 저장될 y값배열
		int xval[] = new int[n + 1]; // n자리 수가 저장될 x값배열

		for (int i = 0; i < yval.length; i++) { // y값을 랜덤으로 출력
			yval[i] = (int) (Math.random() * 300 + 1); // 1~300까지
			for (int j = 1; j < i; j++) {
				if (yval[j] == yval[i]) {
					i--;
					break;
				}
			}
		}

		for (int i = 0; i < xval.length; i++) { // x값을 랜덤으로 출력
			xval[i] = (int) (Math.random() * 300 + 1); // 1~300까지
			for (int j = 1; j < i; j++) {
				if (xval[j] == xval[i]) {
					i--;
					break;
				}
			}
		}

		for (int i = 0; i < xval.length - 1; i++) {

			System.out.println("P" + xval[i] + " : " + "(" + xval[i] + ", " + yval[i] + ")");

		}

		System.out.println("복원에 사용될 참가자들");

		// 출력된 n1부터 ni까지의 (x,y)값 중에서 입력받은 k만큼 랜덤으로 뽑음
		// 복원에 사용될 참가자 번호 랜덤으로 뽑기

		int r[] = new int[k];
		for (int i = 0; i < k; i++) {
			r[i] = ((int) (Math.random() * n));
			for (int j = 1; j < i; j++) {
				if (r[i] == r[j]) {
					i--;
					break;
				}
			}
		}

		// 복원에 사용될 참가자들 배열
		int aval[] = new int[k + 1]; // k자리 수가 저장될 x값배열
		int bval[] = new int[k + 1]; // k자리 수가 저장될 y값배열

		for (int i = 0; i < k; i++) {
			aval[i] = xval[r[i]];
			bval[i] = yval[r[i]];
		}

		for (int i = 0; i < k; i++) {

			System.out.println("K" + aval[i] + " : " + "(" + aval[i] + ", " + bval[i] + ")");
		}

		return r;

	}

}
