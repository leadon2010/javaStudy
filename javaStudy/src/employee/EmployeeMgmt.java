package employee;

import java.util.Scanner;

public class EmployeeMgmt {
	public static void main(String[] args) {
		EmployeeProc prc = new EmployeeProc();
		int choice = 0;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println();
			System.out.println("메뉴를 선택하세요.[1.입력 2.한건조회 3.전체조회 4.한건삭제 5.종료]");
			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				prc.insertEmp();
				break;
			case 2:
				prc.selectEmp();
				break;
			case 3:
				prc.showEmpList();
				break;
			case 4:
				prc.deleteEmp();
				break;
			case 5:
				System.out.println("종료합니다.");
				System.exit(0);
			}// switch
		} // while
	}// end of main
}// end of class
