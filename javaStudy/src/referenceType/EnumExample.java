package referenceType;

import java.util.Calendar;

enum Week {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumExample {
	public static void main(String[] args) {
		Week today = null;

		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);

		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		System.out.println(today.compareTo(Week.THURSDAY));

		Week[] days = Week.values();
		for (Week day : days) {
			System.out.println(day);
		}

		if (today == Week.SUNDAY)
			System.out.println("일요일에는 재밌게 놉니다.");
		else
			System.out.println("평일에는 공부합니다.");
	}

}
