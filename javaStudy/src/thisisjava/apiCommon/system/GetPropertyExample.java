package thisisjava.apiCommon.system;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {
	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");

		System.out.println("운영체제의 이름: " + osName);
		System.out.println("사용자의 이름: " + userName);
		System.out.println("사용자의 홈디렉토리: " + userHome);

		System.out.println("-------------------------------------");
		System.out.println("  [  key   |       value");
		System.out.println("-------------------------------------");
		Properties props = System.getProperties();
		Set keys = props.keySet();
		for (Object obj : keys) {
			String key = (String) obj;
			String value = System.getProperty(key);
			System.out.println("[ " + key + " ]  " + value);
		}
	}
}
