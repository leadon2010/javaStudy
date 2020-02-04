package employees.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface EmpService {
	// 단건조회
	public Employees searchEmp(int empId);

	// 전체리스트 조회
	public List<Employees> searchAll();

	// 한건 입력
	public void insertEmp(Employees emp);

	// 수정
	public void updateEmp(Employees emp);

	// 삭제
	public void deleteEmp(int empId);

	// Job_id
	public Set<String> distinctJob();
	
	// 로그인 처리.
	public Map<String, String> memberInfo();

}
