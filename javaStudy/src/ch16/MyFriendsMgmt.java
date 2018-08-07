package ch16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyFriendsMgmt {

	public static void main(String[] args) {

		// MyFriendProc proc = new MyFriendProc();
		MyFriendListProc proc = new MyFriendListProc();
		Scanner sc = new Scanner(System.in);
		int choice = 0;

		while (true) {
			proc.mainMenu();
			try {
				choice = sc.nextInt();
				sc.nextLine();
			} catch (InputMismatchException e) {
				sc.nextLine();
				System.out.println("정상적인 메뉴를 선택하세요.");
			}
			switch (choice) {

			case 1:
				proc.insertUnivFriend();
				break;

			case 2:
				proc.insertCompFriend();
				break;

			case 3:
				proc.showList();
				break;

			case 4:
				proc.searchName();
				break;

			case 5:
				proc.searchPhone();
				break;
			case 6:
				proc.deleteFriend();
				break;

			case 7:
				proc.showSortList();
				break;

			case 8:
				proc.setData();
				break;

			case 9:
				System.out.println("종료합니다.");
				System.exit(0);

			}// end of switch

		} // while
	}// end of main

}// end of class
