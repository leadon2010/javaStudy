package ch23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertCollection {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Box", "Toy", "Box", "Toy");
		list = new ArrayList<>(list);
		for (String s : list) {
			System.out.print(s + " ");
		}
		System.out.println();
		Set<String> set = new HashSet<>(list);
		for (String s : set) {
			System.out.print(s + " ");
		}
	}// end of main
}// end of class
