package thisisjava;

import java.util.Scanner;

public class AccountExample {
	public static void main(String[] args) {
		Account[] accntAry = new Account[5];
		Scanner sc = new Scanner(System.in);
		String menu = "";
		while (true) {
			System.out.println("메뉴를 선택하세요. 1)신규 2)입금 3)출금 4)조회 5)종료");
			menu = sc.nextLine();
			if ("1".equals(menu)) {
				System.out.println("신규메뉴");
				System.out.println("계좌번호 입력:");
				String accountNo = sc.nextLine();
				System.out.println("이름 입력:");
				String name = sc.nextLine();
				System.out.println("금액 입력:");
				int balance = sc.nextInt();
				sc.nextLine();
				for (int i = 0; i < accntAry.length; i++) {
					if (accntAry[i] == null) {
						Account acnt = new Account(accountNo, name, balance);
						accntAry[i] = acnt;
						break;
					}
				}
				System.out.println("성공");

			} else if ("2".equals(menu)) {
				System.out.println("입금메뉴");
				System.out.println("계좌입력:");
				String accountNo = sc.nextLine();
				boolean acntExist = false;
				for (int i = 0; i < accntAry.length; i++) {
					if (accntAry[i] != null && accntAry[i].getAccountNo().equals(accountNo)) {
						acntExist = true;
						System.out.println("금액입력:");
						int money = sc.nextInt();
						sc.nextLine();
						accntAry[i].deposit(money);
						break;
					}
				}
				if (!acntExist) {
					System.out.println("존재하지 않는 계좌입니다.");
				}
				System.out.println("성공");

			} else if ("3".equals(menu)) {
				System.out.println("출금메뉴");
				System.out.println("계좌입력:");
				String accountNo = sc.nextLine();
				boolean acntExist = false;
				for (int i = 0; i < accntAry.length; i++) {
					if (accntAry[i] != null && accntAry[i].getAccountNo().equals(accountNo)) {
						acntExist = true;
						System.out.println("금액입력:");
						int money = sc.nextInt();
						sc.nextLine();
						accntAry[i].withdraw(money);
						break;
					}
				}
				if (!acntExist) {
					System.out.println("존재하지 않는 계좌입니다.");
				}
				System.out.println("성공");

			} else if ("4".equals(menu)) {
				System.out.println("조회메뉴");
				System.out.println("계좌입력:");
				String accountNo = sc.nextLine();
				boolean acntExist = false;
				for (int i = 0; i < accntAry.length; i++) {
					if (accntAry[i] != null && accntAry[i].getAccountNo().equals(accountNo)) {
						acntExist = true;
						accntAry[i].checkBalance();
						break;
					}
				}
				if (!acntExist) {
					System.out.println("존재하지 않는 계좌입니다.");
				}
				System.out.println("성공");

			} else if ("5".equals(menu)) {
				System.out.println("종료메뉴");
				break;

			}

		}
		System.out.println("프로그램종료.");
	}
}
