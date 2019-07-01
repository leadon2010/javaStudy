package ac.yedam.board.control;

import java.util.List;
import java.util.Scanner;

import ac.yedam.board.Board;
import ac.yedam.board.BoardService;
import ac.yedam.board.impl.BoardServiceImpl;

public class BoardProc {

	Scanner sc = new Scanner(System.in);
	BoardService service = BoardServiceImpl.getInstance();
	String id, pw, name, parentNo;

	// call method.
	public void execute() {

		checkLogin();
		while (true) {
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
		System.out.print("제목입력:");
		String title = sc.nextLine();
		System.out.print("내용입력:");
		String content = sc.nextLine();

		Board board = new Board();
		board.setTitle(title);
		board.setContent(content);
		board.setWriter(id);

		service.writeBoard(board);
	}

	public void updateBoard() {
		System.out.println("변경할 게시번호 선택:");
		int boardNo = sc.nextInt();
		sc.nextLine();
		if (checkResponsibility(boardNo, id)) {
			System.out.println("내용입력:");
			String content = sc.nextLine();
			Board board = service.getBoard(boardNo);
			board.setContent(content);
			service.updateBoard(board);
		}else {
			System.out.println("변경권한이 없습니다.");
		}

	}

	public boolean checkResponsibility(int boardNo, String id) {

		return service.checkResponsibility(boardNo, id);
	}

	public void deleteBoard() {
		System.out.println("삭제할 게시번호 선택:");
		int boardNo = sc.nextInt();
		sc.nextLine();
		if (checkResponsibility(boardNo, id)) {
			service.deleteBoard(boardNo);
		}else {
			System.out.println("변경권한이 없습니다.");
		}
	}

	public void getBoard() {
		System.out.println("조회할 번호:");
		int boardNo = sc.nextInt();
		sc.nextLine();
		// 원본글
		System.out.println("----------[원본글]------------");
		Board board = service.getBoard(boardNo);
		System.out.print("제목    :   " + board.getTitle() + "\n");
		System.out.print("내용    :   " + board.getContent() + "\n");
		System.out.print("작성자 :   " + board.getWriter() + "\n");
		System.out.print("작성일 :   " + board.getCreateDate() + "\n");
		System.out.println("----------[댓글]--------------");
		// 댓글
		List<Board> list = service.getReplyList(boardNo);
		for (Board b : list) {
			System.out.println(" --> " + b.getBoardNo() + " | " + b.getContent() + " | " + b.getWriter() + " | "
					+ b.getCreateDate());
		}
		System.out.println("----------------------------");
		System.out.println("1.댓글작성 2.이전메뉴");
		int subMenu = sc.nextInt();
		sc.nextLine();
		if (subMenu == 1) {
			System.out.print("내용입력:");
			String content = sc.nextLine();
			Board reply = new Board();
			reply.setContent(content);
			reply.setWriter(id);
			reply.setParentNo(board.getBoardNo());
			service.writeReply(reply);
			return;
		} else {
			return;
		}
	}

	public void getBoardList() {
		List<Board> list = service.getBoardList();
		System.out.println("BoardNo  Title\t         Writer     Date");
		System.out.println("=========================================================");
		for (Board b : list) {
			System.out.printf("%7d  %-15s %-10s %20s\n", b.getBoardNo(), b.getTitle(), b.getWriter(),
					b.getCreateDate());
		}
	}

}
