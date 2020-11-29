package api;

import java.util.Calendar;

public class Temp {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal.getActualMaximum(Calendar.DATE));

		cal.set(2020, 11, 13);
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal.getActualMaximum(Calendar.DATE));
		int temp = 2;
		if (temp % 2 == 1) {
			System.out.print(String.format("%3d", 12));
			System.out.print(String.format("%3d", 12));
			System.out.print(String.format("%3d", 12));
			System.out.print(String.format("%3d", 12));
			System.out.println();
		}
		System.out.print(String.format("%4d", 12));
		System.out.print(String.format("%4d", 12));
		System.out.print(String.format("%4d", 12));
		System.out.print(String.format("%4d", 12));
		System.out.println();
		System.out.print(String.format("%5d", 12));
		System.out.print(String.format("%5d", 12));
		System.out.print(String.format("%5d", 12));
		System.out.print(String.format("%5d", 12));
		System.out.println();

		System.out.printf("%3d", 5);
	}
}
