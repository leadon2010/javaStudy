package thisisjava.collection.List.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 학생정보 저장하는 프로그램.
 * Student 클래스를 통해서 데이터를 조작하는 프로그램입니다.
 * 2019.06.13
 */
class Student {
	private int sno;
	private String name;
	private String major;

	public Student(int sno, String name, String major) {
		super();
		this.sno = sno;
		this.name = name;
		this.major = major;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", major=" + major + "]";
	}

}

public class CollectionExample {
	static List<Student> list = null;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		list = new ArrayList<>();
		int menu = 0;
		while (true) {
			System.out.println("메뉴를 선택하세요.");
			switch (menu) {

			case 1:
				System.out.println("학생정보를 입력하세요.");
				System.out.print("이름: ");
				String sname = sc.nextLine();
				System.out.print("전공: ");
				String smajor = sc.nextLine();
				System.out.print("학번:");
				int sno = sc.nextInt();
				sc.nextLine();

				save(sno, sname, smajor);

				for (Student st : list) {
					System.out.println(st);
				}
				if (sno == 9) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}

			}
		}
	}

	static void save(int sno, String name, String major) {
		list.add(new Student(sno, name, major));
	}

	static Student get(int sno) {
		Student stnt = null;
		for (Student std : list) {
			if (std.getSno() == sno)
				stnt = std;
			else
				stnt = null;
		}
		return stnt;
	}
}
