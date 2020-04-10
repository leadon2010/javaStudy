package config;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExample {
	public static void main(String[] args) throws Exception {
		Properties properties = new Properties();
		String path = PropertiesExample.class.getResource("database.properties").getPath();
		System.out.println(path);
		path = URLDecoder.decode(path, "utf-8");
		properties.load(new FileReader(path));

		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("user");
		String passwd = properties.getProperty("passwd");

		System.out.println(driver + "\n" + url + "\n" + username + "\n" + passwd);
	}
}
