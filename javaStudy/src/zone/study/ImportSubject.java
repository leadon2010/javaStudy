package zone.study;

import com.yedamClass.Student;
import com.yedamClass.Teacher;

class StudyClass {
	Teacher teacher;
	Student[] sAry;

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Student[] getsAry() {
		return sAry;
	}

	public void setsAry(Student[] sAry) {
		this.sAry = sAry;
	}

}

public class ImportSubject {
	public static void main(String[] args) {
		
		StudyClass sclass1 = new StudyClass();

		Teacher teacher = new Teacher("teacher1", "t1111", "english");

		Student[] sAry = new Student[3];
		sclass1.setTeacher(teacher);
		sAry[0] = new Student("sname1", "s1111", "english");
		sAry[1] = new Student("sname2", "s2222", "english");
		sAry[2] = new Student("sname3", "s3333", "english");
		sclass1.setsAry(sAry);

		showClassList(sclass1);
	}

	static void showClassList(StudyClass sc) {
		System.out.println("[교수정보]");
		System.out.println("Teacher name: " + sc.getTeacher().getName());
		System.out.println("Teacher no: " + sc.getTeacher().getSsn());
		System.out.println("[학생정보]");
		for (int i = 0; i < sc.getsAry().length; i++) {
			System.out.println("sname: " + sc.getsAry()[i].getName() + ", sno: " + sc.getsAry()[i].getSsn()
					+ ", major: " + sc.getsAry()[i].getMajor());
		}

	}

	static void println(int a, String str) {
		for (int i = 0; i < a; i++)
			System.out.println(str);
	}
}
