package api.system;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {
	public static void main(String[] args) {
//		Properties prop = System.getProperties();
//		Set<Object> set = prop.keySet();
//		for (Object obj : set) {
//			System.out.println(obj.toString() + " -> " + prop.get(obj.toString()));
//		}

		Map<String, String> map = System.getenv();
		Set<String> sSet = map.keySet();
		for (String str : sSet) {
			System.out.println(str);
		}
	}
}
