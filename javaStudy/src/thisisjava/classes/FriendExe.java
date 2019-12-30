package thisisjava.classes;

import java.util.Scanner;

public class FriendExe {

	static Friends[] fArray = new Friends[10];
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		while (true) {
			System.out.println("------------------------------------");
			System.out.println("1.입력 2.조회 3.리스트 4.종료");
			System.out.println("------------------------------------");
			System.out.print("선택>");
			int menu = sc.nextInt();
			sc.nextLine();

			if (menu == 1) {
				addFriend();

			} else if (menu == 2) {
				findFriend();

			} else if (menu == 3) {
				listFriend();

			} else if (menu == 4) {
				break;
			}

		}
	}// end of main

	static void comFriend() {
		System.out.println("회사명을 입력");
	}

	static void univFriend() {

	}

	static void etcFriend() {

	}

	static void addFriend() {
		System.out.print("1.회사동료 2.학교동창 3.그외");
		int subMenu = sc.nextInt();
		sc.nextLine();
		if (subMenu == 1) {
			comFriend();

		} else if (subMenu == 2) {
			univFriend();

		} else if (subMenu == 3) {
			etcFriend();

		}
	}

	static void findFriend() {

	}

	static void listFriend() {
		for (Friends f : fArray) {
			if (f != null) {
				System.out.println(f);
			}
		}
	}

} // end of class
