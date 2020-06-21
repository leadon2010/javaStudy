package streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, List<String>> map = new HashMap<>();
		map.put("a", Arrays.asList("Abraham", "Abnormal"));
		map.put("b", Arrays.asList("Bob", "Bobby"));

		Set<String> set = map.keySet();
		Iterator<String> iter = set.iterator();

		while (iter.hasNext()) {
			String key = iter.next();
			List<String> strList = map.get(key);
			System.out.println(key);
			strList.stream().forEach(s -> System.out.print(s + " "));
			System.out.println();
			System.out.println("-------------------------");
		}
	}
}
