package thisisjava;

import java.util.Calendar;

public class Temp {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		
		int thisYear = cal.get(Calendar.YEAR);
		int thisMonth = cal.get(Calendar.MONTH);
		int lastDate = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

		cal.set(thisYear, thisMonth, 1);

		int dayOfFirstDate = cal.get(Calendar.DAY_OF_WEEK);

		System.out.println(thisYear); // 년도
		System.out.println(thisMonth); // 월
		System.out.println(lastDate); // 오늘날짜

		System.out.println(dayOfFirstDate);

		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));

		System.out.println();

	}

	////////////////////////////////////////
	// enumMethod()
	////////////////////////////////////////
	static void enumMethod(String[] args) {
		Week today = Week.SUNDAY;
		args = new String[] { today.name() };

		if (args.length == 1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);

			if (weekDay == Week.SATURDAY || weekDay == Week.SUNDAY)
				System.out.println("주말입니다.");
			else
				System.out.println("주중입니다.");
		} else {
			System.out.println("none");
		}

	}

	////////////////////////////////////////
	// ary2() method
	////////////////////////////////////////
	static void ary2() {
		int[] firstAry = new int[5];
		int[] secondAry = new int[5];
		int[] thirdAry = new int[5];

		int a = 0;
		for (int i = 0; i < firstAry.length; i++) {
			firstAry[i] = ++a;
		}
		for (int i = 0; i < secondAry.length; i++) {
			secondAry[i] = ++a;
		}
		for (int i = 0; i < thirdAry.length; i++) {
			thirdAry[i] = ++a;
		}

		for (int j = 0; j < firstAry.length; j++) {
			System.out.print(firstAry[j] + " ");
		}
		System.out.println();
		for (int j = 0; j < secondAry.length; j++) {
			System.out.print(secondAry[j] + " ");
		}
		System.out.println();
		for (int j = 0; j < thirdAry.length; j++) {
			System.out.print(thirdAry[j] + " ");
		}
		System.out.println();

		System.out.println("=================================");

		int[][] fourthAry = new int[3][5];
		for (int i = 0; i < fourthAry.length; i++) {
			for (int j = 0; j < fourthAry[i].length; j++) {
				fourthAry[i][j] = ++a;
			}
		}

		for (int i = 0; i < fourthAry.length; i++) {
			for (int j = 0; j < fourthAry[i].length; j++) {
				System.out.print(fourthAry[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("=================================");

	}

	// ary() method.
	////////////////////////////////////////
	static void ary() {
		int[] intAry = new int[5];
		for (int i = 0; i < intAry.length; i++) {
			System.out.println(intAry[i]);
		}
		intAry = new int[] { 10, 20, 30, 40, 50 };
		System.out.println("ary length: " + intAry.length);
		intAry = new int[] { 2, 3, 4 };
		System.out.println("ary length: " + intAry.length);
		System.out.println(intAry);

		String[] strAry = { "hi", "my", "name", "is", "lch" };
		for (String str : strAry) {
			System.out.println(str);
		}
	}

	////////////////////////////////////////
	// gugudan() method.
	////////////////////////////////////////
	static void gugudan() {
		int i = 1;
		while (i < 10) {
			int j = 2;
			while (j < 10) {
				if (j >= i)
					System.out.printf("%d * %d = %2d  ", j, i, j * i);
				else
					System.out.print("            ");
				j += 2;
			}
			i++;
			System.out.println();
		}

	}
}
