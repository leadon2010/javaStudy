package collection.List.example;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Student {
	private String sNo = "";
	private String name = "";
	private String major = "";

	public Student() {

	}

	public Student(String sNo, String name, String major) {
		// TODO Auto-generated constructor stub
		this.sNo = sNo;
		this.name = name;
		this.major = major;
	}

	public String getsNo() {
		return sNo;
	}

	public String getName() {
		return name;
	}

	public String getMajor() {
		return major;
	}
}

public class YedamReport {
	static List<Student> list = new LinkedList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean start = true;
		while (start) {
			System.out.println("1번 : 학생 저장 | 2번 : 학생 조회  | 3번 : 학생 삭제 | 4번 : 종료");
			System.out.print(">");
			String no = "";
			String name = "";
			String major = "";
			int Number = sc.nextInt();
			switch (Number) {
			case 1: // 저장
				System.out.print("학번을 입력 하세요> ");
				no = sc.next();
				System.out.print("이름을 입력 하세요> ");
				name = sc.next();
				System.out.print("전공을 입력 하세요> ");
				major = sc.next();
				Student student = new Student(no, name, major);
				addUser(student, no);
				// list.add(student);
				System.out.println("----------------------------------------------------");
				break;
			case 2: // 조회
				System.out.print("조회 하실 학생번호를 입력하세요> ");
				no = sc.next();
				inquire(no);
				System.out.println("----------------------------------------------------");
				break;
			case 3: // 삭제
				System.out.println("삭제하실 학생번호를 입력하세요> ");
				no = sc.next();
				delete(no);
				System.out.println("----------------------------------------------------");
				break;
			case 4: // 탈출
				System.out.println("프로그램을 종료합니다.");
				start = false;
				break;
			default:
				System.out.println("1~4번까지의 숫자만 넣으세요.");
				break;
			}
		}
	}

	private static void addUser(Student student, String no) {
		// System.out.println("addUser 함수 호출 성공, List Size = " + list.size());
		for (int i = 0; i <= list.size(); i++) {
			// System.out.println("< i = " + i + " >");
			if (list.isEmpty()) { // list에 학생 정보가 하나도 없을 경우 무조건 추가
				// System.out.println("< if문 >");
				list.add(student);
				System.out.println("'" + student.getsNo() + "'" + "번의 학생이 저장되었습니다. \n");
				break;
			} else if (list.get(i).getsNo().equals(no)) { // 추가하려는 학번이 기존 학생의 학번과 동일 시 추가 불가
				// System.out.println("< else if문 >");
				System.out.println("'" + list.get(i).getsNo() + "'" + "번 학생은 이미 존재합니다. \n");
				break;
			} else {
				// System.out.println("< else문 >");
				list.add(student);
				System.out.println("'" + student.getsNo() + "'" + "번 학생이 저장되었습니다. \n");
				break;
			}
		}
	}

	private static void delete(String no) {
		// TODO Auto-generated method stub
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getsNo().equals(no)) {
				// System.out.println("<if 문 >");
				System.out.println("'" + list.get(i).getsNo() + "'" + "번 학생이 삭제되었습니다. \n");
				list.remove(i);
			} else if (list.isEmpty()) {
				// System.out.println("< else if문 >");
				System.out.println("'" + list.get(i).getsNo() + "'" + "번 학생은 존재하지 않습니다. \n");
			}
		}
	}

	private static void inquire(String no) {
		for (int i = 0; i < list.size(); i++) {
			// System.out.println("i = " + i + ", List Size = " + list.size());
			if (list.get(i).getsNo().equals(no)) {
				System.out.println("< " + list.get(i).getsNo() + "학번의 학생 정보 >");
				System.out.println("이름 : " + list.get(i).getName() + " | 전공 : " + list.get(i).getMajor());

				break;
			} else {
				if ((i + 1) == list.size()) {
					System.out.println("'" + no + "'" + "번 학번을 가진 학생은 존재하지 않습니다.");
				}
			}
		}
	}
}
