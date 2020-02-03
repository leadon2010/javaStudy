package interfaces.impl;

import interfaces.model.EmpService;
import interfaces.model.Employees;

public class EmpServiceImpl2 implements EmpService {

	@Override
	public void registerEmp(Employees emp, Employees[] ary) {
		for (int i = 0; i < ary.length; i++) {
			if (ary[i] == null) {
				ary[i] = emp;
				break;
			}
		}
	}

	@Override
	public void searchEmp(int empId, Employees[] ary) {
		for (int i = 0; i < ary.length; i++) {
			if (ary[i] != null && ary[i].getEmployeeId() == empId) {
				System.out.println("firstName is " + ary[i].getFirstName() + " salary is " + ary[i].getSalary());
			}
		}
	}

	@Override
	public void empList(Employees[] ary) {
		for (int i = 0; i < ary.length; i++) {
			if (ary[i] != null)
				System.out.println(ary[i]);
		}
	}

	@Override
	public void deleteEmp(int empId, Employees[] ary) {
		for (int i = 0; i < ary.length; i++) {
			if (ary[i] != null && ary[i].getEmployeeId() == empId) {
				while (i < ary.length && ary[i] != null) {
					ary[i] = ary[i + 1];
					i++;
				}
			}
		}
	}

}
