package employees;

import java.util.List;

public interface EmpService {
	public Employee searchEmp(int empId);

	public List<Employee> searchAll();

	public void insertEmp(Employee emp);

	public void updateEmp(Employee emp);
}
