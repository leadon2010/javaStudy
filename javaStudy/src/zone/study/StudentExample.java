package zone.study;

public class StudentExample {
	public static void main(String[] args) {
		Student student1 = new Student();
		// 1. 필드에 직접 접근
		student1.name = "name";
		student1.sNo = "1111";
		student1.major = "major";
		System.out.println(student1.name + ", " + student1.sNo + ", " + student1.major);

		// 2. 메소드를 통해서 접근
		student1.setName("김학생");
		student1.setsNo("s1234-5678");
		student1.setMajor("english");
		// 문제1) 학생의 생일 필드를 추가하고 get, set 메소드를 정의하세요.
		// 문제2) getStudentInfo()에 생일정보도 보여주도록 메소드를 수정하세요.
		student1.getStudentInfo();

		// 3. 생성자를 통해서 접근
		Student student2 = new Student("박문수", "s1234-1234");
		student2.setMajor("music");
		student2.getStudentInfo();

	}
}
