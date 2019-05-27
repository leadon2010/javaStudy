package yoon.ch23;

import java.util.Comparator;
import java.util.TreeSet;

class IntegerOrder implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2.intValue() - o1.intValue();
	}

}

public class Example232 {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>(new IntegerOrder());
		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(40);

		for (Integer i : ts)
			System.out.println(i);
	}
}
