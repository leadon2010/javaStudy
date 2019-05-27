package yoon.ch23;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCollectionFeature {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Toy");
		set.add("Box");
		set.add("Robot");
		set.add("Box");
		System.out.println("인스턴스 수: " + set.size());

		for (Iterator<String> itr = set.iterator(); itr.hasNext();) {
			String str = itr.next();
			System.out.println(str.toString());
		}
		System.out.println();

		for (String st : set) {
			System.out.println(st.toString());
		}
	}// end of main
}// end of class
