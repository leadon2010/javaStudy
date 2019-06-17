package employees.impl;

import java.util.List;
import java.util.Map;
import java.util.Set;

import employees.EmpService;
import employees.Employees;

public class EmpServiceImpl implements EmpService {

	private static EmpServiceImpl empService = new EmpServiceImpl();

	private EmpServiceImpl() {
	}

	public static EmpServiceImpl getInstance() {
		return empService;
	}

	EmpDAO dao = EmpDAO.getInstance();

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

	@Override
	public Set<String> distinctJob() {
		return dao.getJob();
	}

	@Override
	public Map<String, String> memberInfo() {
		return dao.memberInfo();
	}

}
