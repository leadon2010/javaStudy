package ajava00Start;

/*
 * 작성자: 홍길동
 * 작성일: 2019년 6월 6일
 * 목적: System.out.println 의 메소드
 */
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("First Java Program");
		for (String ar : args) {
			System.out.println(ar.toString());
		}

		/* plus operand */
		// 7 + 5 연산결과
		System.out.println(7 + "+" + 5 + "=" + (7 + 5));
		System.out.println('A');
		System.out.println(3.456);

	}
}
