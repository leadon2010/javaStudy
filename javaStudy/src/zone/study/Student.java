package zone.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Student extends Teacher {
	private String name;

	public Student() {
		super();
		start();
	}

	private void start() {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("당신의 이름을 쓰세요 >> ");
		try {
			name = in.readLine();
			if (super.getBan(name) == null) {
				System.out.println("당신은 우리학교 학생이 아닙니다.");
				return;
			}
			System.out.println("당신의 담임 : " + super.getTeacherName(name));
			System.out.println("당신의 반 : " + super.getBan(name));
			String[] friends = super.getFriends(name);
			System.out.print("반 친구들 : { ");
			for (int i = 0; i < friends.length; i++) {
				System.out.print(friends[i] + " ");
			}
			System.out.println("} ");
		} catch (IOException e) {
			System.err.println("err!!");
		}
	}

	public static void main(String[] ar) {
		new Student();
	}
}
