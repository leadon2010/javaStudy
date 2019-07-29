package thisisjava.interfaces.controller;

import java.util.Scanner;

import thisisjava.interfaces.impl.EmpServiceImpl;
import thisisjava.interfaces.impl.EmpServiceImpl2;
import thisisjava.interfaces.model.EmpService;
import thisisjava.interfaces.model.Employees;

public class HumanResources {
	Scanner sc = new Scanner(System.in);
	Employees[] empls = new Employees[10];
	EmpService service = new EmpServiceImpl2();

	public void execute() {

		int menu = 0;
		while (true) {
			printMenu();
			menu = sc.nextInt();
			sc.nextLine();
			switch (menu) {
			case 1:
				register();
				break;
			case 2:
				search();
				break;
			case 3:
				list();
				break;
			case 4:
				System.out.println("end of program");
				System.exit(0);
			}
		}
	}

	public void printMenu() {
		System.out.println("메뉴를 선택하세요. 1)등록 2)조회 3)전체리스트 4)종료 ");
	}

	public void register() {
		System.out.println("input> EmployeeId");
		int empId = sc.nextInt();
		sc.nextLine();
		System.out.println("input> FirstName");
		String firstName = sc.nextLine();
		System.out.println("input> LastName");
		String lastName = sc.nextLine();
		System.out.println("input> Salary");
		int salary = sc.nextInt();
		sc.nextLine();
		Employees emp = new Employees(empId, firstName, lastName, salary);
		service.registerEmp(emp, empls);
	}

	public void search() {
		System.out.println("input> employee id");
		int empId = sc.nextInt();
		sc.nextLine();
		service.searchEmp(empId, empls);
	}

	public void list() {
		service.empList(empls);
	}
}
