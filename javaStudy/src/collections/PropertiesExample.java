package collections;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExample {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		String path = PropertiesExample.class.getResource("../config/database.properties").getPath();
		path = URLDecoder.decode(path, "UTF-8");
		properties.load(new FileReader(path));

		System.out.println(properties.getProperty("driver"));
		System.out.println(properties.getProperty("url"));
		System.out.println(properties.getProperty("user"));
		System.out.println(properties.getProperty("passwd"));
	}
}
