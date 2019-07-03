package io;

import java.io.IOException;
import java.io.InputStream;

public class SystemInExample {

	public static void main(String[] args) throws IOException {
		
		while (true) {
			
			String[] strAry = { "== 메뉴 ==", "1.예금 조회", "2.예금 출금", "3.예금 입금", "4.종료하기" };
			for (String str : strAry)
				System.out.print(str);

			InputStream is = System.in;
//			System.out.println(is);
			char inputChar = (char) is.read();
//			System.out.println(inputChar);
			switch (inputChar) {
			case '1':
				System.out.println("예금 조회를 선택하셨습니다.");
				break;
			case '2':
				System.out.println("예금 출금을 선택하셨습니다.");
				break;
			case '3':
				System.out.println("예금 입금을 선택하셨습니다.");
				break;
			case '4':
				System.out.println("종료를 선택하셨습니다.");
				break;
//				System.exit(0);
			}
			System.out.println("out of switch");
		}
		
//		System.out.println("end of program");
	}// main

}// class
