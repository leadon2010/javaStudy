package employees.impl;

import java.util.ArrayList;
import java.util.List;

import employees.EmpService;
import employees.Employees;

public class EmpServiceImpl implements EmpService {

	EmpDAO dao = EmpDAO.getInstance();
	Employees emp = null;
	List<Employees> list = new ArrayList<Employees>();

	@Override
	public Employees searchEmp(int empId) {
		return dao.getEmp(empId);
	}

	@Override
	public List<Employees> searchAll() {
		return dao.getEmpList();
	}

	@Override
	public void insertEmp(Employees emp) {
		dao.insertEmp(emp);
	}

	@Override
	public void updateEmp(Employees emp) {
		dao.updateEmp(emp);
	}

	@Override
	public void deleteEmp(int empId) {
		dao.deleteEmp(empId);
	}

}
