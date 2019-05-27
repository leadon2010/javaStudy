package yoon.ch16;

import java.util.Arrays;
import java.util.Scanner;

public class MyFriendProc {
	Friends[] frn = new Friends[10];
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

		frn[cnt] = new UnivFriends(name, major, phone, age);
		System.out.println();
		frn[cnt].showInfo();
		cnt++;
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
		frn[cnt] = new UnivFriends(name, department, phone, age);
		cnt++;
	}// end of insertCompFriend

	void showList() {
		if (cnt > 0) {
			System.out.println("전체리스트를 보여줍니다.");
			System.out.println("=================");
			for (int i = 0; i < cnt; i++) {
				System.out.println("List[" + i + "] / 전체: " + cnt + " 건");
				frn[i].showInfo();
				System.out.println();
			}
		} else {
			System.out.println("입력된 정보가 없습니다.");
			System.out.println("=================");
		}
	}

	void searchName() {
		System.out.println("검색할 이름을 선택하세요.");
		name = sc.nextLine();
		System.out.println("=================");
		for (int i = 0; i < cnt; i++) {
			if (frn[i].getName().equals(name)) {
				frn[i].showInfo();
				System.out.println();
			}
		}
	}

	void searchPhone() {
		System.out.println("검색할 번호를 선택하세요.");
		phone = sc.nextLine();
		System.out.println("=================");
		for (int i = 0; i < cnt; i++) {
			if (frn[i].getPhone().equals(phone)) {
				frn[i].showInfo();
				System.out.println();
			}
		}
	}

	void deleteFriend() {
		int checkNum = -1;

		System.out.println("삭제할 이름을 입력하세요.");
		name = sc.nextLine();
		// 지울 이름의 위치를 찾아서
		while (true) {
			for (int i = 0; i < cnt; i++) {
				if (frn[i].getName().equals(name)) {
					checkNum = i;
				}
			}
			// 같은 이름이 있을 경우에는 삭제한다.
			if (checkNum >= 0) {
				// 그 위치에서 한칸씩 앞으로 당긴다.
				for (int i = checkNum; i < cnt; i++) {
					frn[i] = frn[i + 1];
				}
				cnt--;
				checkNum = -1;
			} else {
				break;
			}
		}
	}

	void setData() {
		frn[cnt++] = new UnivFriends("LEE", "Computer", "1111-1111", 25);
		frn[cnt++] = new UnivFriends("KIM", "Electric", "2222-2222", 26);
		frn[cnt++] = new UnivFriends("YOON", "Electronic", "3333-3333", 25);
		frn[cnt++] = new CompFriends("PARK", "Account", "4444-4444", 35);
		frn[cnt++] = new UnivFriends("KIM", "Electric", "7777-7777", 33);
		frn[cnt++] = new CompFriends("KWON", "Developer", "5555-5555", 36);
		frn[cnt++] = new CompFriends("CHOI", "RND 1", "6666-6666", 38);

	}

	void showSortList() {
		System.out.println("전체리스트를 보여줍니다.");
		System.out.println("=================");
		Friends[] newarr = new Friends[cnt];
		newarr = Arrays.copyOf(frn, cnt);
		Arrays.sort(newarr);
		for (Friends f : newarr) {
			f.showInfo();
			System.out.println();
		}
	}

	void mainMenu() {
		System.out.println("================================================================");
		System.out.println("메뉴를 선택하세요...");
		System.out.println("[1.대학친구입력 2.회사친구입력 3.전체조회 4.이름조회 5.전화번호조회 6.삭제 7. sorting 9.종료]");
		System.out.println("================================================================");
	}
}
