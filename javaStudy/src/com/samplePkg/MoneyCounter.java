package com.samplePkg;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MoneyCounter {
	public static void main(String[] args) {

		int i = 50000; // 화폐 단위를 저장할 변수(총 10가지)
		// 50000->10000->5000->1000->500->100->50->10->5->1 로 변화
		int sw = 0; // 단위를 바꿔줄 때 사용할 변수
		int money = 0; // 계산될 금액이 저장될 변수
		int cnt; // 계산된 매수를 저장할 변수
		Scanner scan = new Scanner(System.in);
		try {
			while (true) {
				System.out.print("금액을 입력하세요 : ");
				money = scan.nextInt();
				if (money < 10000) {
					System.out.println("10,000원 이상 입력해야 합니다.");
				}
				break;
			}
		} catch (InputMismatchException e) {
			System.out.println("숫자만 입력해야 합니다.");
		}
		scan.close();
		for (int j = 0; j < 10; j++) { // 화폐 종류가 10종류이므로 10번 반복
			cnt = money / i; // 금액을 단위로 나누어 몇 매인지 계산
			System.out.println(i + "원 권 " + cnt + "매"); // 출력
			money = money - (cnt * i); // 금액에서 (단위*매수)만큼 제함
			if (sw == 0) { // 5로 시작하는 단위일 경우 5로 나누어 앞자리를 1로
				i = i / 5;
				sw = 1;
			} else { // 1로 시작하는 단위일 경우 2로 나누어 앞자리를 5로
				i = i / 2;
				sw = 0;
			}
		}
	}
}
