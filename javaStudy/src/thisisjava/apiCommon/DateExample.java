package thisisjava.apiCommon;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 d일 a h시 mm분 ss초");
		System.out.println(sdf.format(now));
	}
}
