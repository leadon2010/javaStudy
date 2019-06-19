package zone.study;

import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {

		Calendar now = Calendar.getInstance();
		System.out.println(now.get(Calendar.YEAR));
		System.out.println(now.get(Calendar.MONTH));
		System.out.println(now.get(Calendar.DATE));
		now.set(Calendar.DATE, 1);
		System.out.println(now.get(Calendar.DAY_OF_WEEK));

//		showCal(2019, 10);

	}

	static void showCal(int year, int month) {
		int translateMonth = month - 1;
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, translateMonth);
		cal.set(Calendar.DAY_OF_MONTH, 1);

		int lastDate = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		int firstDayWeek = cal.get(Calendar.DAY_OF_WEEK);

		System.out.println("==========Calendar==========");
		System.out.println("         " + year + "년 " + month + "월");
		System.out.println("============================");
		String[] weeks = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
		for (int i = 0; i < weeks.length; i++) {
			System.out.print(weeks[i] + " ");
		}
		System.out.println();
		for (int i = 1; i < firstDayWeek; i++) {
			System.out.print("    ");
		}
		for (int i = 1; i <= lastDate; i++) {
			System.out.printf("%3d ", i);
			if ((i + firstDayWeek - 1) % 7 == 0)
				System.out.println();
		}

	}

}
