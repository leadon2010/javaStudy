package com.yedam.classes;

import java.util.Scanner;

public class BankApplication {
	private static Account[] acntAry = new Account[10];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("---------------------------------------");
			System.out.println("1.계정생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("---------------------------------------");
			System.out.println(" 선택>");
			int menu = sc.nextInt();
			if (menu == 1) {
				createAccount();
			} else if (menu == 2) {
				accountList();
			} else if (menu == 3) {
				deposit();
			} else if (menu == 4) {
				withdraw();
			} else if (menu == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료.");
	}

	private static void createAccount() {
		System.out.println("계좌번호 입력:");
		String aNo = sc.next();
		sc.nextLine();
		System.out.println("계좌주 입력:");
		String name = sc.next();
		sc.nextLine();
		System.out.println("최초 입금액");
		int balance = sc.nextInt();

		Account acnt = new Account(aNo, name, balance);
		for (int i = 0; i < acntAry.length; i++) {
			if (acntAry[i] == null) {
				acntAry[i] = acnt;
				break;
			}
		}
		acnt.showAccountInfo();
	}

	private static void accountList() {
		System.out.println("-------------------------------------");
		System.out.println("              [계좌목록]");
		System.out.println("-------------------------------------");
		for (int i = 0; i < acntAry.length; i++) {
			if (acntAry[i] != null)
				acntAry[i].accountListInfo();
		}
	}

	private static void deposit() {
		System.out.println("계좌번호를 입력하세요.");
		String aNo = sc.next();
		sc.nextLine();
		System.out.println("입금금액을 입력하세요.");
		int balance = sc.nextInt();
		Account acnt = findAccount(aNo);
		acnt.setBalance(acnt.getBalance() + balance);

		System.out.println("------------------");
		System.out.println("     [예금]");
		System.out.println("------------------");
		System.out.println("계좌번호: " + aNo);
		System.out.println("출금액: " + balance);
		System.out.println("결과: 예금이 성공되었습니다.");

	}

	private static void withdraw() {
		System.out.println("계좌번호를 입력하세요.");
		String aNo = sc.next();
		sc.nextLine();
		System.out.println("출금금액을 입력하세요.");
		int balance = sc.nextInt();
		Account acnt = findAccount(aNo);
		acnt.setBalance(acnt.getBalance() - balance);

		System.out.println("------------------");
		System.out.println("     [출금]");
		System.out.println("------------------");
		System.out.println("계좌번호: " + aNo);
		System.out.println("출금액: " + balance);
		System.out.println("결과: 출금이 성공되었습니다.");

	}

	private static Account findAccount(String aNo) {
		Account retAcnt = null;
		for (int i = 0; i < acntAry.length; i++) {
			if (acntAry[i].getaNo().equals(aNo)) {
				retAcnt = acntAry[i];// return acntAry[i];
				break;
			}
		}
		return retAcnt;
	}
}
