package com.samplePkg;

import java.util.Calendar;
import java.util.Formatter;
import java.util.Locale;
import java.util.Scanner;

public class FormatterTest {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Formatter formatter = new Formatter();
		// System.out.println(formatter.format(Locale.FRANCE, "e = %+10.4f", Math.E));
		System.out.println("==========================");
		System.out.println(formatter.format(Locale.FRANCE, "e = %+10.6f", Math.E));
		System.out.println("==========================");
		formatter = new Formatter();
		System.out.println(formatter.format("%4$2s %3$2s %2$2s %1$2s", "a", "b", "c", "d"));
		System.out.println("==========================");
		formatter = new Formatter();
		System.out.println(formatter.format("%1$2s %2$2s %3$2s %4$2s", "a", "b", "c", "d"));
		System.out.println("==========================");
		formatter = new Formatter();
		System.out.format("Local time: %tT", Calendar.getInstance());

		String sql = "I have a question.";
		System.out.println(sql);

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLong()) {
			// long aLong = sc.nextLong();
			System.out.println("hhhhh" + sc.nextLong());
		}
	}
}
