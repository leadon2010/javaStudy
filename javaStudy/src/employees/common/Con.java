package employees.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Con {

	public static Connection getConnection() {
		Connection conn = null;
		String user = "hr";
		String pw = "hr";
		String url = "jdbc:oracle:thin:@192.168.0.17:1521:orcl";
//		String url = "jdbc:oracle:thin:@localhost:1521:orcl";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, pw);

//			System.out.println("Database에 연결되었습니다.\n");

		} catch (ClassNotFoundException cnfe) {
			System.out.println("DB 드라이버 로딩 실패 :" + cnfe.toString());
		} catch (SQLException sqle) {
			System.out.println("DB 접속실패 : " + sqle.toString());
		} catch (Exception e) {
			System.out.println("Unkonwn error");
			e.printStackTrace();
		}

		return conn;
	}// end of getConnection

	public static void close(Connection conn) {
		try {
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
