package memberCli;

import java.util.List;

public class EmployeesProc {
	EmployeesDAO dao = new EmployeesDAO();

	public void getTitleProc() {
		System.out.println("====================================================================================");
		System.out.println("EmpId\t FirstName\t LastName\t Email\t\t Phone\t\t HireDate");
		System.out.println("====================================================================================");

	}

	public void employeesListProc() {
		System.out.println("\t\t\t\t<<사원목록 리스트>>");
		getTitleProc();
		List<EmployeesDTO> list = dao.getEmployeesList();
		for (EmployeesDTO dto : list) {
			System.out.println(dto);
		}
	}

	public void employeesDTOProc() {
		System.out.println("\t\t\t\t<<사원정보>>");
		getTitleProc();
		EmployeesDTO dto = dao.getEmployeeDTO("101");
		System.out.println(dto);

	}

	public static void main(String[] args) {
		EmployeesProc eproc = new EmployeesProc();
		int menu = 1;

		switch (menu) {
		case 1:
			eproc.employeesListProc();
			break;
		case 2:
			eproc.employeesDTOProc();
			break;
		case 3:
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
		}

	}
}
