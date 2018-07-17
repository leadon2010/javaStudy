package ch31;

import java.time.Instant;
import java.time.Duration;

class InstantDemo {
	public static void main(String[] args) {
		Instant start = Instant.now();
		System.out.println("시작: " + start.getEpochSecond());

		System.out.println("Time flies like an arrow.");
		for (int i = 0; i < 100000; i++)
			System.out.print("");
		;

		Instant end = Instant.now();
		System.out.println("끝: " + end.getEpochSecond());

		Duration between = Duration.between(start, end);
		System.out.println("밀리 초 단위 차: " + between.toMillis());
	}
}