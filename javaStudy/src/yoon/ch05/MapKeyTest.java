package yoon.ch05;

import java.util.HashMap;
import java.util.Map;

public class MapKeyTest {
	public static void main(String ar[]) {
		Map<String, Object> mapobject = new HashMap<String, Object>();
		// 임의로 여러개의 KEY값을 MAP 객체에 PUT
		for (int i = 0; i < 3; i++) {
			mapobject.put("key" + i, i + 24);
		}
		// MAP의 KEY값을 이용하여 VALUE값 가져오기
		for (String mapkey : mapobject.keySet()) {
			System.out.println("key:" + mapkey + ",value:" + mapobject.get(mapkey));
		}
	}
}
