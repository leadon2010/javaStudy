package api;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarExample {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("America/Los_Angeles"));

		for (int i = 0; i < 10; i++) {
			System.out.println(i + " -> " + cal.get(i));
		}
		System.out.println("=============");
		System.out.println(cal.get(Calendar.SEPTEMBER));

		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		switch (week) {
		case Calendar.MONDAY:
			strWeek = "월";
			break;
		case Calendar.TUESDAY:
			strWeek = "월";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "월";
			break;
		case Calendar.THURSDAY:
			strWeek = "월";
			break;
		case Calendar.FRIDAY:
			strWeek = "월";
			break;
		case Calendar.SATURDAY:
			strWeek = "월";
			break;
		default:
			strWeek = "일";
			break;
		}
		int amPm = cal.get(Calendar.AM_PM);
		String strAmPm = null;
		if (amPm == Calendar.AM)
			strAmPm = "오전";
		else
			strAmPm = "오후";

		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);

		System.out.print(year + "년 ");
		System.out.print(month + "월 ");
		System.out.print(day + "일 ");
		System.out.print(strWeek + "요일 ");
		System.out.print(strAmPm + " ");
		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");
		System.out.println(second + "초 ");
		
//		getTimeZone();
	}

	static void getTimeZone() {
		String[] availableIDs = TimeZone.getAvailableIDs();
		System.out.println(availableIDs.length);
		for (String id : availableIDs)
			System.out.println(id);
	}
}
