package thisisjava.collections.map;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExample {
	public static void main(String[] args) throws Exception {
		Properties prop = new Properties();
		String path = PropertiesExample.class.getResource("/config/database.properties").getPath();
		System.out.println(path);
		path = URLDecoder.decode(path, "utf-8"); // UnsupportedEncodingException
		System.out.println(path);
		prop.load(new FileReader(path));// FileNotFoundException

		String driver = prop.getProperty("driver");
		String url = prop.getProperty("url");
		String user = prop.getProperty("user");
		String passwd = prop.getProperty("passwd");

		System.out.println("driver: " + driver + "\nurl: " + url + "\nuser: " + user + "\npasswd: " + passwd);

	}
}
