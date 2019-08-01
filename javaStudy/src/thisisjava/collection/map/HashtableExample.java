package thisisjava.collection.map;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashtableExample {
	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<>();
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");

		Set<String> keySet = map.keySet();
		Iterator<String> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			String strValue = iterator.next();
			System.out.println(strValue + " " + map.get(strValue));
		}
		System.out.println("=============================");
		String id = "spring";
		String passwd = "123";
		if (map.containsKey(id)) {
			if (map.get(id).equals(passwd)) {
				System.out.println("login success.");
			} else {
				System.out.println("check passwd");
			}
		} else {
			System.out.println("존재하지 않은 키 입니다.");
		}
	}
}
