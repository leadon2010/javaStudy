package zone.study;

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
			System.out.println(">선택");
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
		System.out.println("------------------");
		System.out.println("     [계좌목록]");
		System.out.println("------------------");
		for (int i = 0; i < acntAry.length; i++) {
			if (acntAry[i] != null)
				acntAry[i].accountListInfo();
		}
	}

	private static void deposit() {

	}

	private static void withdraw() {

	}

	private static Account findAccount(String aNo) {
		return null;
	}
}
