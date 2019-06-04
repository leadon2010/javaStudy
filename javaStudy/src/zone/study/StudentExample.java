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

		// 실습1) 계산기 객체를 class로 구성하고 int형의 데이터를 계산할 수 있는 덧셈, 뺄셈, 곱셈, 나눗셈 기능을 담당하는 메소드를 정의하세요. ex) Calculator
		// 실습1-1)  int, double 타입의 덧셈, 뺄셈, 곱셈, 나눗셈의 메소드를 정의하세요.(메소드 오버로딩 )
		// 실습1-2) Calculator.execute("+ - * /", 20, 10) => 기호를 통해서 처리하는 메소드를 작성하세요. 
	}
}
