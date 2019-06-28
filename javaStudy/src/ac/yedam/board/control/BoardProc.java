package ac.yedam.board.control;

import java.util.Scanner;

import ac.yedam.board.BoardService;
import ac.yedam.board.impl.BoardServiceImpl;

public class BoardProc {

	Scanner sc = new Scanner(System.in);
	BoardService service = BoardServiceImpl.getInstance();
	String id, pw, name;

	// call method.
	public void execute() {

		checkLogin();

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

	public void checkLogin() {
		while (true) {
			System.out.println("id를 입력하세요.");
			id = sc.nextLine();
			System.out.println("pw를 입력하세요.");
			pw = sc.nextLine();

			name = service.checkLogin(id, pw);

			if (name == null || name.equals(""))
				System.out.println("login fail.");
			else {
				System.out.println("welcome!! " + name);
				break;
			}
		}
	}

	public void writeBoard() {
		System.out.println("제목입력:");
		String title = sc.nextLine();
		System.out.println("내용입력:");
		String content = sc.nextLine();

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
