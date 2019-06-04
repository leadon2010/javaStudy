package zone.study;

public class StudentExample {
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setName("김학생");
		student1.setsNo("s1234-5678");
		student1.setMajor("english");
		// 1.학생의 생일 필드를 추가하고 get, set 메소드를 정의하세요.
		// 2.getStudentInfo()에 생일정보도 보여주도록 메소드를 수정하세요.
		student1.getStudentInfo();

		Student student2 = new Student("박문수", "s1234-1234", "music");
		student2.getStudentInfo();
		
	}
}
