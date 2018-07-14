package ch99;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
	public static void main(String[] args) {
		EmployeeDAO dao = new EmployeeDAO();
		EmployeeDTO dto = new EmployeeDTO();

		int menu = 9;

		switch (menu) {
		case 1: // 전체리스트
			SearchVO vo = new SearchVO();
			vo.setSearchCondition("hire_date");
			vo.setSearchKeyword("2018-01-01");
			List<EmployeeDTO> list = dao.getEmployeesList(vo);
			for (EmployeeDTO dto1 : list)
				System.out.println(dto1);
			break;
		case 2: // 단건조회
			dto = dao.getEmployeeDTO("901");
			System.out.println(dto);
			break;
		case 3: // 입력
			dto.setEmployeeId("904");
			dto.setFirstName("changho");
			dto.setLastName("Lee");
			dto.setEmail("CHANOHO");
			dto.setJobId("AC_ACCOUNT");
			dao.insertEmployee(dto);
			break;
		case 4: // 수정
			dto.setEmployeeId("904");
			dto.setFirstName("changho4");
			dto.setLastName("Lee4");
			dto.setEmail("CHANOHO4");
			dto.setJobId("AC_ACCOUNT");
			dao.updateEmployee(dto);
			break;
		case 5: // 삭제
			dao.deleteEmployee("904");
			break;
		case 6:
			List<Map<String, Object>> listm = dao.getEmpListMap();
			for (Map<String, Object> m : listm) {
				System.out.println(m);
			}
			System.out.println("end");

			// Set<Integer> ks = map.keySet();
			// for (Integer i : ks)
			// System.out.println(i + " / " + map.get(i));
			break;
		case 9:
			List<EmployeeDTO> listc = dao.getEmpListCursor();
			for (EmployeeDTO dto1 : listc)
				System.out.println(dto1);
			break;
		}

	}// end of main

}
