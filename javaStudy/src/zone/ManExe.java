package zone;

import java.util.Scanner;

class Student extends Man {
	String sNo;

	Student(String name, String sNo) {
		super(name);
		this.sNo = sNo;
	}

	@Override
	String getInfo() {
		return super.getInfo() + ", sNo= " + sNo;
	}
}

class Professor extends Man {
	String pNo;

	Professor(String name, String pNo) {
		super(name);
		this.pNo = pNo;
	}

	@Override
	String getInfo() {
		return super.getInfo() + ", pNo= " + pNo;
	}
}

public class ManExe {
	public static void main(String[] args) {
		Man[] manAry = new Man[5];

		Scanner sc = new Scanner(System.in);
		int menu;
		String name, sNo, pNo;
		Man man;
		while (true) {
			System.out.println("메뉴를 선택하세요. 1)학생정보입력 2)교수정보입력 3)전체조회 4) 종료");
			menu = sc.nextInt();

			switch (menu) {
			case 1:
				System.out.println("1번을 선택했습니다.");
				System.out.println("학생이름을 입력하세요.");
				name = sc.next();
				sc.nextLine();
				System.out.println("학번을 입력하세요.");
				sNo = sc.next();
				sc.nextLine();

				man = new Student(name, sNo);
				insertMan(manAry, man);
				break;

			case 2:
				System.out.println("2번을 선택했습니다.");
				System.out.println("교수이름을 입력하세요.");
				name = sc.next();
				sc.nextLine();
				System.out.println("교수번호을 입력하세요.");
				sNo = sc.next();
				sc.nextLine();

				man = new Student(name, sNo);
				insertMan(manAry, man);
				break;

			case 3:
				System.out.println("3번을 선택했습니다.");
				showList(manAry);
				break;

			default:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
		}

	}

	static void insertMan(Man[] ary, Man man) {
		for (int i = 0; i < ary.length; i++) {
			if (ary[i] == null) {
				ary[i] = man;
				break;
			}
		}
	} // end of insertMan

	static void showList(Man[] ary) {
		for (int i = 0; i < ary.length; i++) {
			if (ary[i] != null)
				System.out.println(ary[i].getInfo());
		}
	}

}
