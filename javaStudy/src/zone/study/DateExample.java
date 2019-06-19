package zone.study;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now.toString());

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(sdf.format(now));

		LocalDate ldate = LocalDate.of(2019, 6, 1);
		System.out.println(ldate.getYear() + "년" + ldate.getMonthValue() + "월" + ldate.getDayOfMonth() + "일");

		System.out.println("월의 첫날: " + ldate.getDayOfWeek() + "," + ldate.getDayOfMonth());

		LocalDateTime ldt = LocalDateTime.now();
	}
}
