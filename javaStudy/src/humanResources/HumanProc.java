package humanResources;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HumanProc {

	Scanner scn = new Scanner(System.in);
	List<HumanDTO> list = new ArrayList<HumanDTO>();
	HumanDTO dto = new HumanDTO();
	HumanDAO dao = new HumanDAO();

	// 리스트
	public void getHumanList() {
		System.out.println("리스트를 보여줍니다.");
		list = dao.getHumanList();
		dto.showTitle();
		for (HumanDTO dolist : list) {
			System.out.println(dolist.toString1());
		}

	}// end of getHumanList

	// 단건보기
	public void getHuman() {

	}// end of getHuman

	// 입력
	public void insertHuman() {
		System.out.println("===========================");
		System.out.printf("1.이름을 입력하세요.");
		String name = scn.nextLine();
		dto.sethName(name);
		System.out.printf("2.생일을 입력하세요.");
		String birth = scn.nextLine();
		dto.sethBirth(birth);
		System.out.printf("3.전화를 입력하세요.");
		String phone = scn.nextLine();
		dto.sethPhone(phone);
		System.out.printf("4.주소를 입력하세요.");
		String address = scn.nextLine();
		dto.sethAddress(address);
		System.out.printf("5.기타사항 입력하세요.");
		String comments = scn.nextLine();
		dto.sethComments(comments);

		System.out.println(dto);

		dao.insertHuman(dto);

	}// end of insertHuman

	// 수정
	public void updateHuman() {
		System.out.println("===========================");
		System.out.println("변경할 번호를 입력하세요:");
		String hno = scn.nextLine();
		dto.sethNo(hno);
		System.out.printf("1.이름을 입력하세요.");
		String name = scn.nextLine();
		dto.sethName(name);
		System.out.printf("2.생일을 입력하세요.");
		String birth = scn.nextLine();
		dto.sethBirth(birth);
		System.out.printf("3.전화를 입력하세요.");
		String phone = scn.nextLine();
		dto.sethPhone(phone);
		System.out.printf("4.주소를 입력하세요.");
		String address = scn.nextLine();
		dto.sethAddress(address);
		System.out.printf("5.기타사항 입력하세요.");
		String comments = scn.nextLine();
		dto.sethComments(comments);

		System.out.println(dto);

		dao.updateHuman(dto);

	}// end of updateHuman

	// 삭제
	public void deleteHuman() {
		System.out.println("===========================");
		System.out.println("삭제할 번호를 입력하세요:");
		String hno = scn.nextLine();
		dto.sethNo(hno);

		System.out.println(dto);

		dao.deleteHuman(dto);

	}// end of deleteHuman

}
