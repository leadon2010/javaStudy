package ch16;

import java.util.Scanner;

public class MyFriendsProg1 {

	static Friends[] urf = new Friends[10];
	static Scanner sc = new Scanner(System.in);

	static String name;
	static String phone;
	static String department;
	static String major;

	static int cnt = 0;

	public static void main(String[] args) {
		while (true) {

			mainMenu();

			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:// 대학동료입력
				insertUnivFriend();
				break;

			case 2:// 직장동료입력
				insertCompFriend();
				break;

			case 3:// 전체조회
				showList();
				break;

			case 4:// 이름검색
				searchName();
				break;

			case 5:// 전번검색
				searchPhone();
				break;

			case 6:// 수정
				break;

			case 7:// 삭제
				break;

			case 9:
				System.out.println("종료합니다.");
				System.exit(0);

			}// end of switch
		} // while
	}// end of main

	// 1.대학동료입력
	public static void insertUnivFriend() {
		System.out.println("대학친구의 정보를 입력합니다.");
		System.out.println("이름을 입력하세요.");
		name = sc.nextLine();
		System.out.println("전화번호를 입력하세요.");
		phone = sc.nextLine();
		System.out.println("전공을 입력하세요.");
		major = sc.nextLine();
		urf[cnt] = new UnivFriends(name, major, phone);
		cnt++;

	}

	// 2.회사동료입력
	public static void insertCompFriend() {
		System.out.println("회사친구의 정보를 입력합니다.");
		System.out.println("이름을 입력하세요.");
		name = sc.nextLine();
		System.out.println("전화번호를 입력하세요.");
		phone = sc.nextLine();
		System.out.println("부서를 입력하세요.");
		department = sc.nextLine();
		urf[cnt] = new UnivFriends(name, department, phone);
		cnt++;
	}

	// 3.전체조회
	public static void showList() {
		System.out.println("전체리스트를 보여줍니다.");
		System.out.println("=================");
		for (int i = 0; i < cnt; i++) {
			urf[i].showInfo();
			System.out.println();
		}
	}

	// 4.이름조회
	public static void searchName() {
		System.out.println("검색할 이름을 선택하세요.");
		name = sc.nextLine();
		System.out.println("=================");
		for (int i = 0; i < cnt; i++) {
			if (urf[i].getName().equals(name)) {
				urf[i].showInfo();
				System.out.println();
			}
		}
	}

	// 5.전화번호조회
	public static void searchPhone() {
		System.out.println("검색할 번호를 선택하세요.");
		phone = sc.nextLine();
		System.out.println("=================");
		for (int i = 0; i < cnt; i++) {
			if (urf[i].getPhone().equals(phone)) {
				urf[i].showInfo();
				System.out.println();
			}
		}
	}

	// 6.수정(이름조회)
	public static void updateFriend() {

	}

	// 7.삭제
	public static void deleteFriend() {
		System.out.println("삭제할 이름을 입력하세요.");

	}

	public static void mainMenu() {
		System.out.println();
		System.out.println("메뉴를 선택하세요...");
		System.out.println("[1.대학동료입력 2.회사동료입력 3.전체조회 4.이름조회 5.전화번호조회 6.이름수정 7.삭제 9.종료]");
		System.out.println("=======================================================");
	}
}// end of class
