package thisisjava.collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<>();

		map.put(new Student(1, "홍길동"), 90);
		map.put(new Student(1, "홍길동"), 90);

		System.out.println("총 Entry수: " + map.size());
	}
}
