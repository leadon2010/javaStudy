package chap5_class;

public class StudentExample {
	public static void main(String[] args) {
		Student student = new Student();
		student.name = "LeeChangho";
		student.major = "Java";
		student.studentNo = 123456789;
		student.introduce();
		student.study();

		Student student2 = new Student("Charles", "History");
		student2.setStudentNo(11111111);
		student2.introduce();
		System.out.println(student2.getStudentNo());

	}
}
