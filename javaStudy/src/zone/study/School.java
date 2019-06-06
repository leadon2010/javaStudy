package zone.study;

public class School { // 이 클래스는 자식에게 상속을 해주는 '부모 클래스'입니다. // 가진 재산은 멤버 필드와 inner 클래스, 메서드 등이 있습니다.
	public String school_name = "Commin";
	public String school_class = "Middle School";
	private String[][] class_student_name = { //
			{ "commin1", "commin2" }, // 1반 학생들 이름
			{ "commin3", "commin4" }, // 2반 학생들 이름
			{ "commin5", "commin6" }// 3반 학생들 이름
	};

	private String[] class_teacher_name = { //
			"Micle Cherick", // 1반 담임
			"Brown Shole", // 2반 담임
			"Geary Gohy",// 3반 담임
	};

	public School() {
		System.out.println(school_name + " " + school_class);
	}

	public String getBan(String name) {
		for (int i = 0; i < class_student_name.length; i++) {
			for (int j = 0; j < class_student_name[i].length; j++) {
				if (class_student_name[i][j].equals(name)) {
					return (i + 1) + "";
				}
			}
		}
		return null;
	}

	public String getTeacherName(String student_name) {
		for (int i = 0; i < class_student_name.length; i++) {
			for (int j = 0; j < class_student_name[i].length; j++) {
				if (class_student_name[i][j].equals(student_name)) {
					return class_teacher_name[i];
				}
			}
		}
		return null;
	}

	public String[] getFriends(String student_name) {
		for (int i = 0; i < class_student_name.length; i++) {
			for (int j = 0; j < class_student_name[i].length; j++) {
				if (class_student_name[i][j].equals(student_name)) {
					return class_student_name[i];
				}
			}
		}
		return null;
	}
}