package yoon.ch99;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeDAO {
	private Connection conn = null;

	public Connection getConnection() {
		try {
			String user = "hr";
			String pw = "hr";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";

			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, pw);

			System.out.println("Database에 연결되었습니다.\n");

		} catch (ClassNotFoundException cnfe) {
			System.out.println("DB 드라이버 로딩 실패 :" + cnfe.toString());
		} catch (SQLException sqle) {
			System.out.println("DB 접속실패 : " + sqle.toString());
		} catch (Exception e) {
			System.out.println("Unkonwn error");
			e.printStackTrace();
		}
		return conn;
	}

	public void deleteEmployee(String emp_id) {
		getConnection();
		PreparedStatement pstmt = null;
		int cnt = 0;
		String sql = "delete from employees where employee_id=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(++cnt, emp_id);

			int rs = pstmt.executeUpdate();
			System.out.println(rs + " 건이 삭제되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}// end of deleteEmployee

	public void updateEmployee(EmployeeDTO dto) {
		getConnection();
		PreparedStatement pstmt = null;
		int cnt = 0;
		String sql = "update employees set first_name=?, last_name=?, email=?, job_id=?" + " where employee_id=?" + "";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(++cnt, dto.getFirstName());
			pstmt.setString(++cnt, dto.getLastName());
			pstmt.setString(++cnt, dto.getEmail());
			pstmt.setString(++cnt, dto.getJobId());
			pstmt.setString(++cnt, dto.getEmployeeId());

			int rs = pstmt.executeUpdate();
			System.out.println(rs + " 건이 수정되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}// end of updateEmployee

	public void insertEmployee(EmployeeDTO dto) {
		getConnection();
		PreparedStatement pstmt = null;
		String sql = "insert into employees(employee_id, first_name, last_name, email, hire_date, job_id) "
				+ "values(?,?,?,?,sysdate,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getEmployeeId());
			pstmt.setString(2, dto.getFirstName());
			pstmt.setString(3, dto.getLastName());
			pstmt.setString(4, dto.getEmail());
			pstmt.setString(5, dto.getJobId());

			int rs = pstmt.executeUpdate();
			System.out.println(rs + " 건이 입력되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}// end of insertEmployee

	public EmployeeDTO getEmployeeDTO(String emp_id) {

		getConnection();

		EmployeeDTO dto = null;
		PreparedStatement pstmt = null;
		String sql = " select employee_id, first_name, last_name, email, job_id from employees where employee_id = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, emp_id);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				dto = new EmployeeDTO();
				dto.setEmployeeId(rs.getString("employee_id"));
				dto.setFirstName(rs.getString("first_name"));
				dto.setLastName(rs.getString("last_name"));
				dto.setEmail(rs.getString("email"));
				dto.setJobId(rs.getString("job_id"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return dto;

	}

	public List<EmployeeDTO> getEmployeesList(SearchVO vo) {
		getConnection();
		List<EmployeeDTO> list = new ArrayList<>();
		EmployeeDTO dto = null;
		PreparedStatement pstmt = null;
		int cnt = 0;
		String whereClause = "where 1 = 1 ";
		if (vo.getSearchCondition().equals("first_name")) {
			// whereClause += " and first_name like '%'||" + vo.getSearchKeyword() +
			// "||'%'";
			whereClause += " and first_name like '%'||?||'%' ";
		}
		if (vo.getSearchCondition().equals("hire_date")) {
			// whereClause += " and hire_date >= to_date('" + vo.getSearchKeyword() +
			// "','yyyy-mm-dd')";
			whereClause += " and hire_date >= to_date(?,'yyyy-mm-dd') ";
		}
		String sql = " select employee_id, first_name, last_name, email, job_id, hire_date from employees "
				+ whereClause + " order by 1 desc";
		try {
			System.out.println(sql);
			pstmt = conn.prepareStatement(sql);
			if (vo.getSearchCondition().equals("first_name")) {
				pstmt.setString(++cnt, vo.getSearchKeyword());
			}
			if (vo.getSearchCondition().equals("hire_date")) {
				pstmt.setString(++cnt, vo.getSearchKeyword());
			}
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				dto = new EmployeeDTO();
				dto.setEmployeeId(rs.getString("employee_id"));
				dto.setFirstName(rs.getString("first_name"));
				dto.setLastName(rs.getString("last_name"));
				dto.setEmail(rs.getString("email"));
				dto.setJobId(rs.getString("job_id"));
				dto.setHireDate(rs.getDate("hire_date"));
				list.add(dto);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}// end of getEmployeesList

	public List<EmployeeDTO> getEmpListCursor() {
		getConnection();
		List<EmployeeDTO> list = new ArrayList<EmployeeDTO>();
		EmployeeDTO dto = null;
		try {
			CallableStatement cs = conn.prepareCall("{call get_emplist_proc(?,?,?)}");
			cs.setInt(1, 100);
			cs.setDate(2, new Date(107, 0, 1));
			cs.registerOutParameter(3, oracle.jdbc.OracleTypes.CURSOR);
			cs.executeQuery();
			ResultSet rs = (ResultSet) cs.getObject(3);
			while (rs.next()) {
				dto = new EmployeeDTO();
				dto.setEmployeeId(rs.getString("employee_id"));
				dto.setFirstName(rs.getString("first_name"));
				dto.setLastName(rs.getString("last_name"));
				dto.setHireDate(rs.getDate("hire_date"));
				dto.setJobId(rs.getString("job_id"));

				list.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;

	}// end of getEmpListCursor

	public List<Map<String, Object>> getEmpListMap() {
		getConnection();
		List<Map<String, Object>> list = new ArrayList<>();
		Map<String, Object> map = null;
		String sql = "select employee_id, first_name from employees";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				map = new HashMap<String, Object>();
				map.put("employee_id", rs.getString("employee_id"));
				map.put("first_name", rs.getString("first_name"));
				list.add(map);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return list;

	}
}
