package ch16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MyFriendListProc {
	// Friends[] frn = new Friends[10];
	List<Friends> frn = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	String name;
	String major;
	String department;
	String phone;
	int age;

	int cnt = 0;

	void insertUnivFriend() {
		System.out.println("대학친구의 정보를 입력합니다.");
		System.out.println("이름을 입력하세요.");
		name = sc.nextLine();
		System.out.println("전화번호를 입력하세요.");
		phone = sc.nextLine();
		System.out.println("전공을 입력하세요.");
		major = sc.nextLine();
		System.out.println("나이를 입력하세요.");
		age = sc.nextInt();

		frn.add(new UnivFriends(name, major, phone, age));
		System.out.println();
		for (Friends f : frn)
			f.showInfo();
		// cnt++;
	}// end of insertUnivFriend

	void insertCompFriend() {
		System.out.println("회사친구의 정보를 입력합니다.");
		System.out.println("이름을 입력하세요.");
		name = sc.nextLine();
		System.out.println("전화번호를 입력하세요.");
		phone = sc.nextLine();
		System.out.println("부서를 입력하세요.");
		department = sc.nextLine();
		System.out.println("나이를 입력하세요.");
		age = sc.nextInt();
		frn.add(new UnivFriends(name, department, phone, age));
		System.out.println();
		for (Friends f : frn)
			f.showInfo();
		// cnt++;
	}// end of insertCompFriend

	void showList() {
		System.out.println("전체리스트를 보여줍니다.");
		System.out.println("=================");
		for (Friends f : frn) {
			f.showInfo();
			System.out.println();
		}
	}

	void searchName() {
		System.out.println("검색할 이름을 선택하세요.");
		name = sc.nextLine();
		System.out.println("=================");
		for (Friends f : frn) {
			if (f.getName().equals(name))
				f.showInfo();
		}
		// for (int i = 0; i < cnt; i++) {
		// if (frn[i].getName().equals(name)) {
		// frn[i].showInfo();
		// System.out.println();
		// }
	}

	void searchPhone() {
		System.out.println("검색할 번호를 선택하세요.");
		phone = sc.nextLine();
		System.out.println("=================");
		for (Friends f : frn) {
			if (f.getPhone().equals(phone))
				f.showInfo();
		}
		// for (int i = 0; i < cnt; i++) {
		// if (frn[i].getPhone().equals(phone)) {
		// frn[i].showInfo();
		// System.out.println();
		// }
	}

	void deleteFriend() {

		System.out.println("삭제할 이름을 입력하세요.");
		name = sc.nextLine();
		int idx = 0;
		// 지울 이름의 위치를 찾아서
		for (Friends f : frn) {
			if (f.getName().equals(name)) {
				break;
			}
			idx++;
		}
		frn.remove(idx);
	}

	void setData() {
		frn.add(new UnivFriends("LEE", "Computer", "1111-1111", 25));
		frn.add(new UnivFriends("KIM", "Electric", "2222-2222", 26));
		frn.add(new UnivFriends("YOON", "Electronic", "3333-3333", 25));
		frn.add(new CompFriends("PARK", "Account", "4444-4444", 35));
		frn.add(new UnivFriends("KIM", "Electric", "7777-7777", 33));
		frn.add(new CompFriends("KWON", "Developer", "5555-5555", 36));
		frn.add(new CompFriends("CHOI", "RND 1", "6666-6666", 38));

	}

	void showSortList() {
		System.out.println("전체리스트를 보여줍니다.");
		System.out.println("=================");
		Friends[] newarr = new Friends[cnt];
		Arrays.sort(newarr);
		for (Friends f : newarr) {
			f.showInfo();
			System.out.println();
		}
		// for (int i = 0; i < cnt; i++) {
		// System.out.println("List[" + i + "] / 전체: " + cnt + " 건");
		// frn[i].showInfo();
		// System.out.println();
		// }
	}

	void mainMenu() {
		System.out.println("================================================================");
		System.out.println("메뉴를 선택하세요...");
		System.out.println("[1.대학친구입력 2.회사친구입력 3.전체조회 4.이름조회 5.전화번호조회 6.삭제 7.sorting 8.데이터생성 9.종료]");
		System.out.println("================================================================");
	}
}
