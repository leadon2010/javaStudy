package employees;

import java.util.List;

public interface EmpService {
	public Employees searchEmp(int empId);

	public List<Employees> searchAll();

	public void insertEmp(Employees emp);

	public void updateEmp(Employees emp);
}
