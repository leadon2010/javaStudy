package yoon.ch31;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo2 {
	public static void main(String[] args) {
		ZonedDateTime departure = ZonedDateTime.of(LocalDateTime.of(2017, 6, 9, 14, 30), ZoneId.of("Asia/Seoul"));
		System.out.println("Departure : " + departure);
		ZonedDateTime arrival = ZonedDateTime.of(LocalDateTime.of(2017, 6, 9, 18, 25), ZoneId.of("Europe/Paris"));
		System.out.println("Departure : " + arrival);

		System.out.println(Duration.between(departure, arrival));

	}
}
