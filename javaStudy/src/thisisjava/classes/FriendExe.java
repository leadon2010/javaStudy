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

	static void saveFriend(Friends friend) {
		for (int i = 0; i < fArray.length; i++) {
			if (fArray[i] == null) {
				fArray[i] = friend;
				break;
			}
		}
	}

	static void comFriend() {
		System.out.println("회사명을 입력");
		String companyName = sc.nextLine();
		System.out.println("부서명을 입력:");
		String deptName = sc.nextLine();
		System.out.println("이름입력:");
		String name = sc.nextLine();
		System.out.println("전화번호입력:");
		String phone = sc.nextLine();
		ComFriends friend = new ComFriends(name, phone, companyName, deptName);
		saveFriend(friend);
	}

	static void univFriend() {
		System.out.println("학교명을 입력");
		String companyName = sc.nextLine();
		System.out.println("전공을 입력:");
		String deptName = sc.nextLine();
		System.out.println("이름입력:");
		String name = sc.nextLine();
		System.out.println("전화번호입력:");
		String phone = sc.nextLine();
		UnivFriends friend = new UnivFriends(name, phone, companyName, deptName);
		saveFriend(friend);
	}

	static void etcFriend() {
		System.out.println("이름입력:");
		String name = sc.nextLine();
		System.out.println("전화번호입력:");
		String phone = sc.nextLine();
		Friends friend = new Friends(name, phone);
		saveFriend(friend);
	}

	static void addFriend() {
		System.out.println("1.회사동료 2.학교동창 3.그외");
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
		System.out.println("조회할 이름입력:");
		String name = sc.nextLine();
		for (Friends friend : fArray) {
			if (friend != null && friend.getName().equals(name)) {
				System.out.println(friend.showInfo());
			}
		}
	}

	static void listFriend() {
		for (Friends f : fArray) {
			if (f != null) {
				System.out.println(f.showInfo());
			}
		}
	}

} // end of class
