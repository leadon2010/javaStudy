package zzz;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDAO {
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;

	public void close() {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public Student[] getStudentList() {
		conn = ConnectDB.getConnect();

		Student[] students = new Student[10];
		String sql = "select * from student_info order by 1";
		int i = 0;
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Student stu = new Student();
				stu.setStdId(rs.getInt("std_id"));
				stu.setStdName(rs.getString("std_name"));
				stu.setStdAge(rs.getInt("std_age"));
				stu.setStdPhone(rs.getString("std_phone"));
				stu.setStdScore(rs.getInt("std_score"));
				students[i++] = stu;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return students;
	}

	public void updateScore(Student student) {
		conn = ConnectDB.getConnect();
		String sql = "update student_info set std_score = " + student.getStdScore() + " where  std_id = "
				+ student.getStdId();
		try {
			Statement stmt = conn.createStatement();
			int r = stmt.executeUpdate(sql);
//			System.out.println(r + "건 수정됨.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}
}
