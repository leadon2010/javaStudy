package thisisjava.interfaces.model;

public interface EmpService {

	public void registerEmp(Employees emp, Employees[] ary);

	public void searchEmp(int empId, Employees[] ary);

	public void empList(Employees[] ary);

}
