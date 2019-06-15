package employees.control;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import employees.EmpService;
import employees.Employees;
import employees.impl.EmpServiceImpl;

public class EmployeeProc {

	Scanner sc = new Scanner(System.in);

	EmpService service = new EmpServiceImpl();
	Employees emp = new Employees();

	String firstName, lastName, email, jobId;
	int salary, employeeId;

	public void execute() {
		int choice = 0;

		while (true) {
			System.out.println();
			System.out.println("메뉴를 선택하세요. [1.입력 2.수정 3.한건조회 4.전체조회 9.종료]");
			choice = sc.nextInt();
			sc.nextLine();

			if (choice == 1) {
				insertEmpProc();

			} else if (choice == 2) {
				updateEmpProc();

			} else if (choice == 3) {
				getEmpProc();

			} else if (choice == 4) {
				getEmpListProc();

			} else if (choice == 9) {
				if (sc != null) {
					sc.close();
				}
				System.exit(0);
			}
		}

	}

	public void insertEmpProc() {

		System.out.println("신규사원입력:");
		System.out.println("firstName =>");
		firstName = sc.nextLine();
		System.out.println("lastName =>");
		lastName = sc.nextLine();
		System.out.println("email =>");
		email = sc.nextLine();
		System.out.println("jobId =>");
		jobId = sc.nextLine();
		System.out.println("salary =>");
		salary = sc.nextInt();

		emp.setFirstName(firstName);
		emp.setLastName(lastName);
		emp.setSalary(salary);
		emp.setEmail(email);
		emp.setJobId(jobId);

		service.insertEmp(emp);

	}

	public void updateEmpProc() {

		System.out.println("사원정보변경:");
		System.out.println("employeeId =>");
		employeeId = sc.nextInt();
		sc.nextLine();
		System.out.println("firstName =>");
		firstName = sc.nextLine();
		System.out.println("lastName =>");
		lastName = sc.nextLine();
		System.out.println("email =>");
		email = sc.nextLine();
		System.out.println("jobId =>");
		jobId = sc.nextLine();
		System.out.println("salary =>");
		salary = sc.nextInt();

		emp.setFirstName(firstName);
		emp.setLastName(lastName);
		emp.setSalary(salary);
		emp.setEmail(email);
		emp.setJobId(jobId);
		emp.setEmployeeId(employeeId);

		service.updateEmp(emp);

	}

	public void getEmpProc() {
		System.out.println("한건조회:");
		System.out.println("employeeId =>");
		employeeId = sc.nextInt();
		sc.nextLine();
		Employees emp = service.searchEmp(employeeId);
		System.out.println(emp);
	}

	public void getEmpListProc() {
		System.out.println("전체사원조회:");
		List<Employees> list = new ArrayList<>();
		list = service.searchAll();
		for (Employees e : list) {
			System.out.println(e);
		}
	}
}
