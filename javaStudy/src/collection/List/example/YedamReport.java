package collection.List.example;

import java.util.LinkedList;

import java.util.List;

import java.util.Scanner;

//	학생정보를 저장하는 프로그램(Ver.1.0)

//	만든이: 김화정(2019.06.13)

//	최종수정일: 2019.06.13

class Student {

	private String sno;

	private String name;

	private String major;

	public Student(String sn, String n, String m) {

		sno = sn;

		name = n;

		major = m;

	}

	public String getSno() {

		return sno;

	}

	public void print() {

		System.out.println("힉생번호:" + sno + "    이름:" + name + "    학과: " + major);

	}

}

public class YedamReport {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		List<Student> list = new LinkedList<>();

		int num = 0;

		while (num != 4) {

			System.out.println("1.저장	2.조회(sno)	3.삭제(sno)	4.종료");

			num = sc.nextInt();

			switch (num) {

			case 1:

				System.out.print("학생번호:");

				String sno = sc.next();

				System.out.print("이름:");

				String name = sc.next();

				System.out.print("학과:");

				String major = sc.next();

				list.add(new Student(sno, name, major));

				break;

			case 2:

				System.out.println("조회할 학생번호 입력:");

				String snum1 = sc.next();

				for (Student s : list) {

					if (s.getSno().equals(snum1)) { // list의 Student인스턴스들 중 sno가 snum1과 같은사람이 있으면

						System.out.println("*****학생정보*****");

						s.print(); // 출력해라

						System.out.println("***************");

					}

				}

				break;

			case 3:

				System.out.print("삭제할 학생번호 입력:");

				String snum2 = sc.next();

				for (int i = 0; i < list.size(); i++) {

					if (list.get(i).getSno().equals(snum2)) { // sno가 snum2랑 같은 사람이 있으면 지워라

						list.remove(i);

						System.out.println("학생이 삭제되었습니다.");

					}

				}

				break;

			case 4:

				System.out.println("종료합니다.");

				break;

			}

		}

	}

}