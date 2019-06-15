package employees.control;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import employees.Employees;
import employees.impl.EmpDAO;

public class EmployeeProc {

	Scanner sc = new Scanner(System.in);
	String firstName;
	String lastName;
	String email;
	String jobId;
	int salary;
	int employeeId;

	EmpDAO dao = new EmpDAO();
	Employees emp = new Employees();

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

		dao.insertEmp(emp);

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

		dao.updateEmp(emp);

	}

	public void getEmpProc() {
		System.out.println("한건조회:");
		System.out.println("employeeId =>");
		employeeId = sc.nextInt();
		sc.nextLine();
		Employees emp = dao.getEmp(employeeId);
		System.out.println(emp);
	}

	public void getEmpListProc() {
		System.out.println("전체사원조회:");
		List<Employees> list = new ArrayList<>();
		list = dao.getEmpList();
		for (Employees e : list) {
			System.out.println(e);
		}
	}
}
