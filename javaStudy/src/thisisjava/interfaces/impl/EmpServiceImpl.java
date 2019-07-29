package thisisjava.interfaces.impl;

import thisisjava.interfaces.model.EmpService;
import thisisjava.interfaces.model.Employees;

public class EmpServiceImpl implements EmpService {

	@Override
	public void registerEmp(Employees emp, Employees[] ary) {
		for (int i = 0; i < ary.length; i++) {
			if (ary[i] == null) {
				ary[i] = emp;
//				break;
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
		// TODO Auto-generated method stub
		
	}

}
