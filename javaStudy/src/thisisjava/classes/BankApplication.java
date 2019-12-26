package thisisjava.classes;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;

		while (run) {
			System.out.println("=====================");
			System.out.println("1.계좌생성 2.계좌목록 3.예금 4.출금 5.종료 ");
			System.out.println("=====================");
			System.out.print("선택>");

			int selectNo = scn.nextInt();
			scn.nextLine();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료.");
	}

	public static void createAccount() {
		System.out.print("계좌번호 입력:");
		String ano = scn.nextLine();
		System.out.print("이름입력:");
		String owner = scn.nextLine();
		System.out.print("금액입력:");
		int balance = scn.nextInt();
		Account acnt = new Account(ano, owner, balance);
		for (int i = 0; i < 100; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = acnt;
				break;
			}
		}
		System.out.println("입력완료.");
	}

	public static void accountList() {
		for (Account accnt : accountArray) {
			if (accnt != null) {
				System.out.println(accnt);
			}
		}
	}

	public static void deposit() {
		System.out.print("조회할 구좌 입력:");
		String ano = scn.nextLine();
		System.out.print("금액입력:");
		int amount = scn.nextInt();
		scn.nextLine();
		Account acnt = findAccount(ano);
		int balance = acnt.getBalance();
		acnt.setBalance(balance + amount);

	}

	public static void withdraw() {
		System.out.print("조회할 구좌 입력:");
		String ano = scn.nextLine();
		System.out.print("금액입력:");
		int amount = scn.nextInt();
		scn.nextLine();
		Account acnt = findAccount(ano);
		int balance = acnt.getBalance();
		acnt.setBalance(balance - amount);

	}

	public static Account findAccount(String ano) {
		Account accnt = null;
		for (Account acnt : accountArray) {
			if (ano.equals(acnt.getAno())) {
				accnt = acnt;
				break;
			}
		}
		return accnt;
	}
}
