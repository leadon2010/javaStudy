package project.fileio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HandPhone {
	static String fname = "aaa.txt";

	static class address {
		String name;
		String age;
		String phone;

		public address(String name, String age, String phone) {
			super();
			this.name = name;
			this.age = age;
			this.phone = phone;
		}

	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String select = "";
		System.out.println("친구연락처관리");
		while (select != "4") {
			print_menu();
			select = sc.nextLine();

			switch (select) {
			case "1":
				view_juso();
				break;
			case "2":
				add_juso();
				break;
			case "3":
				delete_juso();
				break;
			case "4":
				return;
			default:
				System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
			}
		}
		sc.close();
	}

	static void print_menu() {
		System.out.println();
		System.out.println("1)연락처출력");
		System.out.println("2)연락처등록");
		System.out.println("3)연락처삭제");
		System.out.println("4)끝내기");
	}

	static void view_juso() throws IOException {

		String str = "";
		File f = new File(fname);

		if (!f.exists()) {
			BufferedWriter bw = new BufferedWriter(new FileWriter(fname));
			bw.close();
		}

		BufferedReader br = new BufferedReader(new FileReader(fname));
		int i;
		for (i = 1;; i++) {
			if (!br.ready()) {
				break;
			} else {
				str = br.readLine();
				System.out.printf("%2d: %s\n", i, str);
			}
		}
		if (i == 1) {
			System.out.println("연락처에 전화번호가 없어요.");
			br.close();
		}
	}// view_juso()

	static void add_juso() throws IOException {
		Scanner sc = new Scanner(System.in);

		address adr = new address("", "", "");

		String wstr = "";

		BufferedWriter bw = new BufferedWriter(new FileWriter(fname, true));
		System.out.println("이름 입력:");
		adr.name = sc.nextLine();
		System.out.println("나이 입력:");
		adr.age = sc.nextLine();
		System.out.println("전화번호 입력:");
		adr.phone = sc.nextLine();

		wstr = adr.name + "\t" + adr.age + "\t" + adr.phone;
		bw.write(wstr);
		bw.newLine();

		bw.close();
		sc.close();

	}// add_juso()

	static void delete_juso() throws IOException {
		Scanner sc = new Scanner(System.in);

		String[] readStr = new String[50];
		String str = "";
		int del, i, count = 0;

		BufferedReader br = new BufferedReader(new FileReader(fname));
		if (!br.ready()) {
			System.out.println("연락처 파일이 없습니다.");
			br.close();
			sc.close();
			return;
		}

		System.out.println("삭제할 행번호:");
		del = sc.nextInt();
		for (i = 0; i < 50; i++) {
			if ((str = br.readLine()) == null) {
				break;
			}
			if (i + 1 != del) {
				readStr[count] = str;
				count++;
			} else {
				System.out.printf("%d 행이 삭제되었습니다", del);
			}
		}
		br.close();

		BufferedWriter bw = new BufferedWriter(new FileWriter(fname));
		for (i = 0; i < count; i++) {
			bw.write(readStr[i]);
			bw.newLine();
		}
		bw.close();
		sc.close();

	}// delete_juso()
}
