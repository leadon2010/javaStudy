package ch23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ConversionCollection {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("boy", "toy", "plastic", "boy");
		for (String l : list)
			System.out.println(l);
		System.out.println("=======================");
		
		HashSet<String> set = new HashSet<>();
		set = new HashSet<>(list);

		List<String> nist = new ArrayList<>(set);
		for (String s : nist)
			System.out.println(s);
	}
}
