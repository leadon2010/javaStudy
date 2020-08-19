package classes.abstract_class;

import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {
		createCal(2020, 9);
	}

	public static void createCal(int year, int month) {
		String[] dayOfWeeks = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, 1);
		int firstDay = cal.get(Calendar.DAY_OF_WEEK);
		cal.set(year, month, 0);
		int lastDate = cal.get(Calendar.DATE);

		System.out.println("<< " + year + "년 " + month + "월 >>");

		// 요일 출력
		for (int i = 0; i < dayOfWeeks.length; i++) {
			System.out.printf("%4s", dayOfWeeks[i]);
		}
		System.out.println();
		// 빈칸 만들어주기
		for (int i = 1; i < firstDay; i++) {
			System.out.printf("%4s", "");
		}
		// 날짜 출력
		for (int i = 1; i <= lastDate; i++) {
			System.out.printf("%4d", i);
			if ((i + firstDay - 1) % 7 == 0)
				System.out.println();
		}
	}
}
