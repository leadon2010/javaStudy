package testSample;

import java.util.Random;

//7에 가장 가까운 정수찾기
public class NumberClosest7 {
	public static void main(String[] args) {

		int i; // 반복문 돌리기 위한 변수

		int number[] = new int[10]; // 임의 정수 10개를 받기 위한 배열

		Random random = new Random();

		for (i = 0; i < 10; i++) { // 절대값 500이하의 정수를 임의로 발생시킨다.

			number[i] = random.nextInt(500); // 0~500까지 랜덤

			if (random.nextInt(2) == 0) { // 0또는 1을 발생시켜서 0이면

				number[i] = number[i] * (-1); // 음수로 바꿔준다

			}

		}

		int C = 555; // 현재 정수와 7의 차이를 넣어서, S와 비교하기 위한 변수

		int S = 0; // 7과 정수의 차를 넣을 변수

		int G = 0; // 7과 가장 차이가 적게 나는 수를 넣을 변수

		for (i = 0; i < 10; i++) {

			if (number[i] >= 7) {

				S = number[i] - 7;

			} else {

				S = 7 - number[i];

			}

			if (C > S) { // C의 초기값이 555이므로 첫 1회 무조건 실행

				C = S; // C에 7과 정수의 차이를 대입

				G = number[i]; // 현재 7과 가장 차이가 적게 나는 수를 G에 대입

			}

		}

		// 출력

		System.out.print("[");

		String c;

		for (i = 0; i < 10; i++) {

			c = (i == 9) ? "]\n" : ", ";

			System.out.print(number[i] + c);

		}

		System.out.println("7과 가장 차이가 적게 나는 수는 " + G + "입니다.");

	}
}
