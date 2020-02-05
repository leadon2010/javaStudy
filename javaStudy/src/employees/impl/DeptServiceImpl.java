package employees.impl;

import java.util.List;

import employees.model.Departments;
import employees.model.DeptService;

public class DeptServiceImpl implements DeptService {
	private static DeptServiceImpl service = new DeptServiceImpl();

	private DeptServiceImpl() {
	}

	public static DeptServiceImpl getInstance() {
		return service;
	}

	DeptDAO dao = DeptDAO.getInstance();

	@Override
	public Departments[] getDeptList() {
		return dao.getDeptList();
	}

	@Override
	public List getDepartmentsList() {
		return dao.getDepartments();
	}

}
