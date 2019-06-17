package api;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatExample {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		System.out.println();
//		Date now = new Date();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일  a h시 mm분 ss초");
		String nowString = now.format(dateTimeFormatter);
		System.out.println(nowString);
	}
}
