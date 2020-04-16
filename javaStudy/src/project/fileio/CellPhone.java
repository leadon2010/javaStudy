package project.fileio;

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
		System.out.println("name");
		String name = scn.nextLine();
		System.out.println("age");
		String age = scn.nextLine();
		System.out.println("phone");
		String phone = scn.nextLine();

		Address addr = new Address(name, age, phone);

		try {
			FileWriter fw = new FileWriter(fileName);
			fw.write(addr.name + ", " + addr.age + ", " + addr.phone);
			fw.flush();
			fw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
