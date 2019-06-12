package collection.Map;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExample {
	public static void main(String[] args) throws Exception {
		Properties properties = new Properties();
		String path = PropertiesExample.class.getResource("database.properties").getPath();
		path = URLDecoder.decode(path, "utf-8");
		properties.load(new FileReader(path));

		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String user = properties.getProperty("username");
		String pw = properties.getProperty("password");

		System.out.println("driver : " + driver);
		System.out.println("url : " + url);
		System.out.println("username : " + user);
		System.out.println("password : " + pw);
	}
}
