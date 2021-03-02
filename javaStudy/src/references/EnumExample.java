package references;

import java.util.Calendar;
import java.util.Random;

enum Week {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

public class EnumExample {

	public static void main(String[] args) {
		Week today = Week.SUNDAY;

		String name = today.name();
		System.out.println(name);

//		System.out.println(today.ordinal());
		Week[] weeks = Week.values();

//		for (Week week : weeks) {
//			System.out.println(week);
//		}
		for (int i = 0; i < weeks.length; i++) {
			System.out.println(weeks[i]);
		}

//		Calendar cal = Calendar.getInstance();
//		System.out.println(cal.get(Calendar.YEAR));
//
//		Random random = new Random();
//		for (int i = 0; i < 10; i++) {
//			System.out.printf("%.2f", random.nextDouble());
//			System.out.println();
//		}
//
//		for (int i = 0; i < 5; i++) {
//			System.out.println(Math.random());
//		}
//
//		double[] numbers = new double[10];
//		for (int i = 0; i < numbers.length; i++) {
//			numbers[i] = (int) (Math.random() * 1000) / 1000.0;
//		}
//		for (double d : numbers)
//			System.out.println(d);
	}
}
