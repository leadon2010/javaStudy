package com.yedam.collections.map;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableExample {
	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<>();
		map.put("spring", "123");
		map.put("summer", "1234");
		map.put("fall", "12345");
		map.put("winter", "123456");

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("아이디와 비번을 입력하세요. 종료하려면  exit");
			System.out.print("id: ");
			String id = sc.nextLine();
			System.out.print("passwd: ");
			String passwd = sc.nextLine();
			System.out.println();
			if (!id.equals("exit")) {
				if (map.containsKey(id)) {
					if (map.get(id).equals(passwd))
						System.out.println("로그인 되었습니다.");
					else
						System.out.println("비밀번호가 일치하지 않습니다.");
				} else {
					System.out.println("존재하지 않는 아이디입니다.");
				}
			} else {
				System.out.println("프로그램 종료합니다.");
				sc.close();
				break;
			}
		}
		System.out.println("end of program..");
	}
}