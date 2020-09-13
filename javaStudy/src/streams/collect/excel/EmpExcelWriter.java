package streams.collect.excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class EmpExcelWriter {
	public void xlsWriter(List<EmployeeVO> list) {
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet();
		HSSFRow row = sheet.createRow(0);
		HSSFCell cell;

		cell = row.createCell(0);
		cell.setCellValue("ID");

		cell = row.createCell(1);
		cell.setCellValue("FirstName");

		cell = row.createCell(2);
		cell.setCellValue("LastName");

		cell = row.createCell(3);
		cell.setCellValue("Email");

		EmployeeVO vo;
		for (int i = 0; i < list.size(); i++) {
			vo = list.get(i);
			row = sheet.createRow(i + 1);

			cell = row.createCell(0);
			cell.setCellValue(vo.getEmployeeId());

			cell = row.createCell(1);
			cell.setCellValue(vo.getFirstName());

			cell = row.createCell(2);
			cell.setCellValue(vo.getLastName());

			cell = row.createCell(3);
			cell.setCellValue(vo.getEmail());

		}

		File file = new File("testExcel.xls");
		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream(file);
			workbook.write(fos);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (workbook != null)
					workbook.close();
				if (fos != null)
					fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("created.");
	}
}
