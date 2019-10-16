package com.yedam.collections.tree;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Fruits {
	String name;
	int price;

	Fruits(String name, int price) {
		this.name = name;
		this.price = price;
	}
}

class ComparatorClass implements Comparator<Fruits> {

	@Override
	public int compare(Fruits o1, Fruits o2) {
		if (o1.price > o2.price)
			return 1;
		else if (o1.price == o2.price)
			return 0;
		else
			return -1;
	}

}

public class TreeSetExample4 {
	public static void main(String[] args) {
		TreeSet<Fruits> treeSet = new TreeSet<>(new ComparatorClass());

		treeSet = new TreeSet<>((a, b) -> {
			if (a.price > b.price) {
				return -1;
			} else if (a.price == b.price) {
				return 0;
			} else {
				return 1;
			}
		});

		treeSet.add(new Fruits("aaa", 10));
		treeSet.add(new Fruits("bbb", 2));
		treeSet.add(new Fruits("ccc", 30));
		treeSet.add(new Fruits("ddd", 7));

		Iterator<Fruits> iter = treeSet.iterator();

		while (iter.hasNext()) {
			Fruits f = iter.next();
			System.out.println(f.name + ",  " + f.price);
		}
	}
}
