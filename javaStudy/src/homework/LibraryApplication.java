package homework;

import java.util.Scanner;

public class LibraryApplication {
	public static void main(String[] args) {
		Book[] bookList = new Book[10];
		Member user = new Member();
		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("----------------------------------------------------");
			System.out.println("1)도서정보등록 2)사용자정보등록 3)도서대출 4)도서반납 5)대여목록 9)종료 ");
			System.out.println("----------------------------------------------------");
			System.out.print("선택> ");

			int menu = scn.nextInt();
			scn.nextLine();
			if (menu == 1) {
				System.out.print("제목을 입력하세요>> ");
				String title = scn.nextLine();
				System.out.print("저자를 입력하세요>> ");
				String author = scn.nextLine();
				System.out.print("출판사를 입력하세요>> ");
				String press = scn.nextLine();
				System.out.print("금액을 입력하세요>> ");
				int price = scn.nextInt();
				scn.nextLine();

				for (int i = 0; i < bookList.length; i++) {
					if (bookList[i] == null) {
						bookList[i] = new Book(title, author, press, price);
						break;
					}
				}

			} else if (menu == 2) {
				System.out.print("이름을 입력하세요>> ");
				String name = scn.nextLine();
				System.out.print("회원번호를 입력하세요>> ");
				String id = scn.nextLine();
				user.setMemberId(id);
				user.setMemberName(name);

			} else if (menu == 3) {
				System.out.print("대출제목을 입력하세요>> ");
				String title = scn.nextLine();
				int checkCnt = 0;
				for (int i = 0; i < bookList.length; i++) {
					if (bookList[i] != null && bookList[i].getBookTitle().equals(title)) {
						user.rent(bookList[i]);
						checkCnt++;
					}
				}
				if (checkCnt == 0) {
					System.out.println("찾고있는 도서정보[" + title + "]" + "가 존재하지 않습니다.");
				}

			} else if (menu == 4) {
				System.out.print("반납제목을 입력하세요>> ");
				String title = scn.nextLine();
				int checkCnt = 0;
				for (int i = 0; i < bookList.length; i++) {
					if (bookList[i] != null && bookList[i].getBookTitle().equals(title)) {
						user.overdue(bookList[i]);
						checkCnt++;
					}
				}
				if (checkCnt == 0) {
					System.out.println("찾고있는 도서정보[" + title + "]" + "가 존재하지 않습니다.");
				}

			} else if (menu == 5) {
				System.out.println(user.getBookList());

			} else if (menu == 9) {
				break;
			}
		}
		System.out.println("도서프로그램 종료.");
		scn.close();
	}
}
