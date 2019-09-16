package thisisjava.collection.Set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Fruit {
	String name;
	int price;

	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}
}

class DescComparator implements Comparator<Fruit> {

	@Override
	public int compare(Fruit o1, Fruit o2) {
		if (o1.price < o2.price)
			return -1;
		else if (o1.price > o2.price)
			return 1;
		else
			return 0;
//		return o1.price - o2.price;
	}
}

public class ComparatorExample {
	public static void main(String[] args) {
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new DescComparator());
		treeSet.add(new Fruit("포도", 3000));
		treeSet.add(new Fruit("수박", 10000));
		treeSet.add(new Fruit("딸기", 6000));

		Iterator<Fruit> iterator = treeSet.iterator();
		while (iterator.hasNext()) {
			Fruit fruit = iterator.next();
			System.out.println(fruit.name + "- " + fruit.price);
		}
	}
}
