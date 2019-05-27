package yoon.ch31;

import java.time.ZoneId;

public class ZoeIdDemo1 {
	public static void main(String[] args) {
		ZoneId paris = ZoneId.of("Europe/Paris");
		System.out.println(paris);
	}
}
