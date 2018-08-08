package employee;

import java.util.Scanner;

public class EmployeeProc {
	Employee[] emp = new Employee[10];
	int cnt = 0;
	Scanner sc = new Scanner(System.in);
	int employeeId = 0;
	String firstName;
	String lastName;
	int salary;

	void insertEmp() {
		System.out.println("EmployeeNo을 입력하세요.");
		employeeId = sc.nextInt();
		sc.nextLine();
		System.out.println("firstName을 입력하세요.");
		firstName = sc.nextLine();
		System.out.println("lastName을 입력하세요.");
		lastName = sc.nextLine();
		System.out.println("salary를 입력하세요.");
		salary = sc.nextInt();
		sc.nextLine();
		emp[cnt] = new Employee(employeeId, firstName, lastName, salary);
		System.out.println("한건 입력되었습니다.");
		System.out.println(emp[cnt]);
		cnt++;
	}

	void selectEmp() {
		System.out.println("firstName을 입력하세요.");
		firstName = sc.nextLine();
		for (int i = 0; i < cnt; i++) {
			if (emp[i].getFirstName().equals(firstName))
				System.out.println(emp[i]);
			System.out.println();
		}
	}

	void showEmpList() {
		System.out.println("전체목록을 보여줍니다.");
		for (int i = 0; i < cnt; i++) {
			System.out.println(emp[i]);
			System.out.println();
		}
	}

	void deleteEmp() {

	}
}
