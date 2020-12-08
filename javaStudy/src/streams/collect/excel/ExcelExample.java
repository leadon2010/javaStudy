package streams.collect.excel;

import java.util.Arrays;
import java.util.List;

public class ExcelExample {

	public static void main(String[] args) {

		EmployeeVO e1 = new EmployeeVO(1, "first1", "last1", "email1", 1000);
		EmployeeVO e2 = new EmployeeVO(1, "first2", "last2", "email2", 2000);
		EmployeeVO e3 = new EmployeeVO(1, "first3", "last3", "email3", 3000);
		EmployeeVO e4 = new EmployeeVO(1, "first4", "last4", "email4", 4000);
		EmployeeVO e5 = new EmployeeVO(1, "first5", "last5", "email5", 5000);

		List<EmployeeVO> list = Arrays.asList(e1, e2, e3, e4, e5);
		EmpExcelWriter writer = new EmpExcelWriter();
		writer.xlsWriter(list);

	}

}
