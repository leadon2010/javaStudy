package ch16test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class FriendProc {
	List<Friends> list = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	String name;
	String phone;
	int age;
	String major;
	String department;

	public static void main(String[] args) {
		FriendProc prc = new FriendProc();
		int choice = 0;
		while (true) {
			// System.out.println("메뉴를 선택하세요.");
			prc.showMenu();
			choice = sc.nextInt();
			sc.nextLine();
			if (choice == 0) {
				System.out.println("프로그램 종료합니다.");
				System.exit(0);
			} else if (choice == 1) {
				System.out.println("대학동료입력:::>");
				prc.insertUnivFriend();
			} else if (choice == 2) {
				System.out.println("직장동료입력:::>");
				prc.insertCompFriend();
			} else if (choice == 3) {
				System.out.println("전체리스트:::>");
				prc.showAll();
			} else if (choice == 4) {
				System.out.println("한건조회[이름]");
				prc.showInfoByName();
			} else if (choice == 5) {
				System.out.println("한건조회[전화번호]");
				prc.showInfoByPhone();
			} else if (choice == 6) {
				System.out.println("삭제[이름]");
				prc.deleteFriend();
			} else if (choice == 9) {
				prc.createInitInfo();
			} else {
				System.out.println("잘못된 메뉴를 선택했습니다.");
			}
		}
	}

	public void insertUnivFriend() {
		// (String na, String ma, String ph, int age)
		System.out.println("이름을 입력하세요.");
		name = sc.nextLine();
		System.out.println("전공을 입력하세요.");
		major = sc.nextLine();
		System.out.println("전화번호를 입력하세요.");
		phone = sc.nextLine();
		System.out.println("나이를 입력하세요.");
		age = sc.nextInt();
		sc.nextLine();

		Friends frn = new UnivFriends(name, major, phone, age);
		list.add(frn);

	}

	public void insertCompFriend() {
		// CompFriends(String na, String de, String ph, int age)
		System.out.println("이름을 입력하세요.");
		name = sc.nextLine();
		System.out.println("근무부서를 입력하세요.");
		department = sc.nextLine();
		System.out.println("전화번호를 입력하세요.");
		phone = sc.nextLine();
		System.out.println("나이를 입력하세요.");
		age = sc.nextInt();
		sc.nextLine();

		Friends frn = new CompFriends(name, department, phone, age);
		list.add(frn);

	}

	public void deleteFriend() {
		System.out.println("삭제할 이름을 입력하세요.");
		String sname = sc.nextLine();
		Friends itn;
		for (Iterator<Friends> itr = list.iterator(); itr.hasNext();) {
			itn = itr.next();
			if (sname.equals(itn.getName()))
				itr.remove();
		}
	}

	public void showInfoByName() {
		System.out.println("조회할 이름을 입력하세요.");
		String sname = sc.nextLine();

		for (Friends fr : list) {
			// if (fr.getName().equals(sname))
			if (fr.getName().indexOf(sname) != -1) {
				fr.showInfo();
				System.out.println();
			}
		}
	}

	public void showInfoByPhone() {
		System.out.println("조회할 번호를 입력하세요.");
		String sname = sc.nextLine();

		for (Friends fr : list) {
			// if (fr.getPhone().equals(sname))
			if (fr.getPhone().indexOf(sname) != -1) {
				fr.showInfo();
				System.out.println();
			}
		}
	}

	public void showAll() {
		for (Friends f : list) {
			f.showInfo();
			System.out.println();
		}
	}

	public void createInitInfo() {
		list.add(new UnivFriends("LEE", "English", "1111", 29));
		list.add(new UnivFriends("CHO", "Mechanics", "2222", 29));
		list.add(new CompFriends("YOON", "RND S1", "3333", 37));
		list.add(new CompFriends("CHOI", "RND S2", "4444", 35));
		list.add(new CompFriends("PARK", "Sales 1", "5555", 30));
		list.add(new UnivFriends("AHN", "Electronics", "1234", 30));
	}

	public void showMenu() {
		System.out.println("[1.대학동기 2.직장동료 3.전체조회 4.조회(이름) 5.조회(전화번호) 6.삭제(이름) 0.프로그램종료]");
	}
}
