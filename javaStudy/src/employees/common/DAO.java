package employees.common;

import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DAO {

	public static void main(String[] args) {
		getConnection();
	}

	public static Connection getConnection() {
		Connection conn = null;
		String user = "hr";
		String pw = "hr";
		String url = "jdbc:oracle:thin:@192.168.0.17:1521:orcl";

		try {
			String path = DAO.class.getResource("/config/database.properties").getPath();
			path = URLDecoder.decode(path, "utf-8");

			Properties properties = new Properties();
			properties.load(new FileReader(path));

			user = properties.getProperty("user");
			pw = properties.getProperty("passwd");
			url = properties.getProperty("url");
			String driver = properties.getProperty("driver");

			System.out.println(user + " " + pw + " " + url + " " + driver);

		} catch (IOException e1) {
			e1.printStackTrace();
		}

		try {
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
