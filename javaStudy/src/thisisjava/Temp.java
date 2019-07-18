package thisisjava;

import java.io.IOException;

public class Temp {

	public static void main(String[] args) throws IOException {
		int keyCode = 0;
		while (keyCode != 9) {

//			if (keyCode != 13 && keyCode != 10) {
				System.out.println("input key");
				keyCode = System.in.read();
				System.out.println(keyCode);
//			}

		}
	}
}
