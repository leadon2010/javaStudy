package thisisjava;

import java.io.IOException;

public class WhileKeyController {
	public static void main(String[] args) throws IOException {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		while (run) {
			if (keyCode != 13 && keyCode != 10) {
				System.out.println("------------------------------");
				System.out.println("1.증속 2.감속 3.중지");
				System.out.println("------------------------------");

				keyCode = System.in.read();
				System.out.println("keyCode: " + keyCode);

				if (keyCode == 49) {
					speed++;
					System.out.println("현재속도= " + speed);
				} else if (keyCode == 50) {
					speed--;
					System.out.println("현재속도= " + speed);
				} else if (keyCode == 51) {
					run = false;
				} else if (keyCode == 13) {
					System.out.println("13: " + keyCode);
				} else if (keyCode == 10) {
					System.out.println("10: " + keyCode);
				}

			} else if (keyCode == 13) {
				System.out.println("a:" + keyCode);
				System.in.read();

			} else if (keyCode == 10) {
				System.out.println("b:" + keyCode);
				System.in.read();

			}
		}

		System.out.println("프로그램 종료");
	}
}
