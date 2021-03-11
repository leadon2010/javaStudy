package zzz;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd hh");
		LocalDate ld = LocalDate.parse("2021.03.23 10", dtf);
		System.out.println(ld);

		System.out.println(LocalDateTime.now().format(dtf));

	}
}