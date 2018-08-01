package ch16;

import java.util.Scanner;

class Friends {
	private String name;
	private String phone;

	public Friends(String na, String ph) {
		name = na;
		phone = ph;
	}

	public void showInfo() {
		System.out.println("이름: " + name);
		System.out.println("전화: " + phone);
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}
}

class UnivFriends extends Friends {
	private String major;
	// private String name;
	// private String phone;

	public UnivFriends(String na, String ma, String ph) {
		super(na, ph);
		// name = na;
		// phone = ph;
		major = ma;
	}

	public void showInfo() {
		// System.out.println("이름: " + name);
		// System.out.println("전화: " + phone);
		super.showInfo();
		System.out.println("전공: " + major);
	}
}

class CompFriends extends Friends {
	// private String name;
	// private String phone;

	private String department;

	public CompFriends(String na, String de, String ph) {
		// name = na;
		// phone = ph;
		super(na, ph);
		department = de;
	}

	public void showInfo() {
		// System.out.println("이름: " + name);
		// System.out.println("전화: " + phone);
		super.showInfo();
		System.out.println("부서: " + department);
	}

}

public class MyFriendsProg {
	public static void main(String[] args) {
		Friends[] urf = new Friends[10];
		Scanner sc = new Scanner(System.in);

		String name;
		String phone;
		String department;
		String major;

		int cnt = 0;
		while (true) {
			mainMenu();
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.println("대학친구의 정보를 입력합니다.");
				System.out.println("이름을 입력하세요.");
				name = sc.nextLine();
				System.out.println("전화번호를 입력하세요.");
				phone = sc.nextLine();
				System.out.println("전공을 입력하세요.");
				major = sc.nextLine();
				urf[cnt] = new UnivFriends(name, major, phone);
				cnt++;
				break;

			case 2:
				System.out.println("회사친구의 정보를 입력합니다.");
				System.out.println("이름을 입력하세요.");
				name = sc.nextLine();
				System.out.println("전화번호를 입력하세요.");
				phone = sc.nextLine();
				System.out.println("부서를 입력하세요.");
				department = sc.nextLine();
				urf[cnt] = new UnivFriends(name, department, phone);
				cnt++;
				break;

			case 3:
				System.out.println("전체리스트를 보여줍니다.");
				System.out.println("=================");
				for (int i = 0; i < cnt; i++) {
					urf[i].showInfo();
					System.out.println();
				}
				break;

			case 4:
				System.out.println("검색할 이름을 선택하세요.");
				name = sc.nextLine();
				System.out.println("=================");
				for (int i = 0; i < cnt; i++) {
					if (urf[i].getName().equals(name)) {
						urf[i].showInfo();
						System.out.println();
					}
				}
				break;

			case 5:
				System.out.println("검색할 번호를 선택하세요.");
				phone = sc.nextLine();
				System.out.println("=================");
				for (int i = 0; i < cnt; i++) {
					if (urf[i].getPhone().equals(phone)) {
						urf[i].showInfo();
						System.out.println();
					}
				}
				break;

			case 9:
				System.out.println("종료합니다.");
				System.exit(0);

			}// end of switch
		} // while
	}// end of main

	public static void mainMenu() {
		System.out.println();
		System.out.println("메뉴를 선택하세요...");
		System.out.println("[1.대학친구입력 2.회사친구입력 3.전체조회 4.이름조회 5.전화번호조회 9.종료]");
		System.out.println("=======================================================");
	}
}// end of class
