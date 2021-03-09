package api.dates;

import java.util.Calendar;
import java.util.TimeZone;

public class PrintTimeIdExample {
	public static void main(String[] args) {
		String[] ids = TimeZone.getAvailableIDs();
		for (String str : ids) {
			if (str.startsWith("Asia")) {
//				System.out.println(str);
			}
		}

		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("America/New_York"));
//		cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));

	}
}
