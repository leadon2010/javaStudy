package method;

import java.util.Calendar;

public class CalendarEx {
	public static void main(String[] args) {
		Week today = Week.SUNDAY;
		System.out.println(today == Week.SUNDAY);

		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int day = now.get(Calendar.DAY_OF_MONTH);
		int week = now.get(Calendar.DAY_OF_WEEK);
		//System.out.println(Calendar.HOUR_OF_DAY);
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(week);
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
	}
}
