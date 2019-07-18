package thisisjava;

import java.io.IOException;

public class Temp {

	public static void main(String[] args) throws IOException {
		int keyCode = 0;
//		while (keyCode != 9) {
//			if (keyCode != 13 && keyCode != 10) {
//				System.out.println("input key");
//				keyCode = System.in.read();
//				System.out.println(keyCode);
//			}
//		}
		int i = 0;
		while (i < 10) {
//			System.out.println(i);
			int j = 0;
			while (j < i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
