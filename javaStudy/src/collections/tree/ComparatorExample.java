package collections.tree;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ComparatorExample {
	public static void main(String[] args) {
		TreeMap<Fruit, Integer> map = new TreeMap<>(new Comparator<Fruit>() {
			@Override
			public int compare(Fruit f1, Fruit f2) {
				return f1.price - f2.price;
			}
		});
		map.put(new Fruit("apple", 4000), 1);
		map.put(new Fruit("cherry", 1500), 2);
		map.put(new Fruit("banana", 2600), 3);
		Set<Map.Entry<Fruit, Integer>> set = map.entrySet();
		Iterator<Map.Entry<Fruit, Integer>> iter = set.iterator();
		while (iter.hasNext()) {
			Map.Entry<Fruit, Integer> ent = iter.next();
			System.out.println(ent.getKey().name + ", " + ent.getValue());
		}
	}
}
