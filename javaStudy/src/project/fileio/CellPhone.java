package project.fileio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CellPhone {
	static String fileName = "list.txt";

	static class Address {
		String name;
		String age;
		String phone;

		public Address(String name, String age, String phone) {
			this.name = name;
			this.age = age;
			this.phone = phone;
		}
	} // end of Address

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
//		1. view_juso() 2.add_juso() 3.del_juso() 4.exit
		
		int menu;
		while(true) {
			System.out.println("============================");
			System.out.println("1.view 2.add 3.del 4.exit");
			System.out.println("============================");
			
			menu = scn.nextInt();scn.nextLine();
			
			if (menu == 1) {
				view_juso();
			} else if (menu == 2) {
				add_juso();
			} else if (menu == 3) {
				
			} else if (menu == 4) {
				break;
			}
		} // end of while
		
		System.out.println("==== end of program ====");
	} // end of main()
	
	public static void view_juso() {
		
		File file = new File(fileName);
		if (!file.exists()) {
			try {
				BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			int rowCnt = 0;
			while(true) {
				if (!br.ready())
					break;
				
				String str = br.readLine();
				System.out.println(str);
				rowCnt++;
			}
			if (rowCnt == 0) {
				System.out.println("no line.");
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void add_juso() {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true));
			System.out.print("name>> ");
			String name = scn.nextLine();
			System.out.print("age>> ");
			String age = scn.nextLine();
			System.out.print("phone>> ");
			String phone = scn.nextLine();
			
			Address addr = new Address(name, age, phone);
			bw.write(addr.name + " " + addr.age + " " + addr.phone);
			bw.newLine();
			bw.flush();
			bw.close();
			System.out.println("writed.");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void del_juso() {
		
	}

} // end of class
