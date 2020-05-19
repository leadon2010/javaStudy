package exceptions;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		try {
			Class cls = Class.forName("java.lang.String");
			System.out.println(cls.toString());
		} catch (ClassNotFoundException e) {
			System.out.println("존재하지 않는 클래스입니다.");
		} finally {
			System.out.println(" 항상 실행 되는 내용 ");
		}
		
		System.out.println("end of program.");
	}
}
