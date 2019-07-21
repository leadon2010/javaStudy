package thisisjava;

import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {
		int thisYear = 2019;
		int thisMonth = 8;
		int lastDate = getLastDay(thisMonth);
		int dayOfFirstDate = getDayOfFirstDate(thisMonth);

		int calDay = 1;
		getTitle(thisYear, thisMonth);
		String[] strDay = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
		for (String str : strDay) {
			System.out.print(str + " ");
		}
		System.out.println();
		int r = 1;
		while (r < dayOfFirstDate) {
			System.out.print("    ");
			r++;
		}

		int a = 1;
		while (a <= lastDate) {
			System.out.printf("%3d ", calDay++);
			if ((a + r - 1) % 7 == 0)
				System.out.println();
			a++;
		}
	}

	static void getTitle(int year, int month) {
		System.out.println("===========================");
		System.out.println("         " + year + "년 " + month + "월");
		System.out.println("===========================");
	}

	static int getDayOfFirstDate(int month) {
		int day = 0;
		if (month == 7) {
			day = 2;
		} else if (month == 8) {
			day = 5;
		}
		return day;
	}

	static int getLastDay(int month) {
		int lastDay = 0;
		switch (month) {
		case 1:
			lastDay = 31;
			break;
		case 2:
			lastDay = 28;
			break;
		case 3:
			lastDay = 31;
			break;
		case 4:
			lastDay = 30;
			break;
		case 5:
			lastDay = 31;
			break;
		case 6:
			lastDay = 30;
			break;
		case 7:
			lastDay = 31;
			break;
		case 8:
			lastDay = 31;
			break;
		case 9:
			lastDay = 30;
			break;
		case 10:
			lastDay = 31;
			break;
		case 11:
			lastDay = 30;
			break;
		case 12:
			lastDay = 31;
			break;
		}
		return lastDay;
	}

	////////////////////////////////////////
	// calendar()
	////////////////////////////////////////
	static void calendar() {
		Calendar cal = Calendar.getInstance();

		int thisYear = cal.get(Calendar.YEAR);
		int thisMonth = cal.get(Calendar.MONTH);
		int lastDate = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

		cal.set(thisYear, thisMonth, 1);

		int dayOfFirstDate = cal.get(Calendar.DAY_OF_WEEK);

		System.out.println("올해는 " + thisYear); // 년도
		System.out.println("이번달은 " + thisMonth); // 월
		System.out.println("이번달의 마지막날은 " + lastDate); // 오늘날짜

		System.out.println("1일의 요일은 " + dayOfFirstDate);

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
