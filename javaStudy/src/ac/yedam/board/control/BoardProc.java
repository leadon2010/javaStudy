package ac.yedam.board.control;

import java.util.Scanner;

public class BoardProc {

	Scanner sc = new Scanner(System.in);

	// call method.
	public void execute() {

		System.out.println("메뉴를 선택하세요.");
		System.out.println("1.입력 2.수정 3.삭제 4.조회 5.리스트 9.종료");
		int menu = sc.nextInt();
		sc.nextLine();
		switch (menu) {
		case 1:
			writeBoard();
			break;
		case 2:
			updateBoard();
			break;
		case 3:
			deleteBoard();
			break;
		case 4:
			getBoard();
			break;
		case 5:
			getBoardList();
			break;
		default:
			System.out.println("종료합니다.");
			System.exit(0);
		}

	}

	public void writeBoard() {

	}

	public void updateBoard() {

	}

	public void deleteBoard() {

	}

	public void getBoard() {

	}

	public void getBoardList() {

	}

}
