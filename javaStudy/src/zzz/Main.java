package zzz;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd hh");
		dtf = DateTimeFormatter.ofPattern("yyyy년MM월dd일 hh시mm분ss초");
//		LocalDate ld = LocalDate.parse("2021.03.23 10", dtf);
//		System.out.println(ld);

		System.out.println(LocalDateTime.now().format(dtf));

//		"2021-03-05 10:10:10";
		LocalDateTime ldt1 = LocalDateTime.parse("2021-05-05T12:34:55", DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		System.out.println(ldt1);
		LocalDateTime ldt2 = LocalDateTime.parse("2021-05-05T12:34:44", DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		System.out.println(ldt1 + ", " + ldt2);
		dtf = DateTimeFormatter.ofPattern("yyyyMMddhhmmss");
		LocalDate ldt3 = LocalDate.parse("20200507122334", dtf);

//		System.out.println(ldt3.format(dtf));

		System.out.println("hello-023".replace("-", "").replace("/", ""));
	}
}