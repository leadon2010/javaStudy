package employees.control;

import java.util.Scanner;

public class EmployeeMgmt {
	public static void main(String[] args) {
		EmployeeProc e = new EmployeeProc();
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println();
			System.out.println("메뉴를 선택하세요. [1.입력 2.수정 3.한건조회 4.전체조회 9.종료]");
			choice = sc.nextInt();
			sc.nextLine();

			if (choice == 1) {
				e.insertEmpProc();

			} else if (choice == 2) {
				e.updateEmpProc();

			} else if (choice == 3) {
				e.getEmpProc();

			} else if (choice == 4) {
				e.getEmpListProc();

			} else if (choice == 9) {
				System.exit(0);
			}
		}
	}// end of main
}// end of class
