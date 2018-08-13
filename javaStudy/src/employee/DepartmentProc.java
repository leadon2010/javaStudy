package employee;

import java.util.List;
import java.util.Scanner;

public class DepartmentProc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		DepartmentDAO dao = new DepartmentDAO();
		Department d = new Department();

		int choice = 0;
		if (choice == 1) {
			dao.insert(d);
		} else if (choice == 2) {
			int deptId = sc.nextInt();
			d.setDepartmentId(deptId);
			d.setDepartmentName("test2");
			d.setManagerId(101);
			d.setLocationId(1800);
			dao.updateDept(d);
		} else if (choice == 3) {
			dao.selectAll();
		}

	}
}
