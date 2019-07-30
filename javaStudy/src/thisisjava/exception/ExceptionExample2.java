package thisisjava.exception;

public class ExceptionExample2 {
	public static void main(String[] args) {
		try {
			String str1 = args[0];
			String str2 = args[1];
			int num1, num2;
			num1 = Integer.parseInt(str1);
			num2 = Integer.parseInt(str2);
			System.out.println("num1 => " + num1);
			System.out.println("num2 => " + num2);

		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("실행 매개값이 수가 부족합니다.");
			System.out.println("[실행방법]");
			System.out.println("java ExceptionExample2 arg1 arg2");

		} catch (NumberFormatException e2) {
			System.out.println("숫자로 변환할 수 없습니다.");

//		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e2) {
//			System.out.println("실행매개값의 수가 부족하거나 숫자로 변화할 수 없습니다.");
//			
		} catch (Exception e3) {
			System.out.println("알 수 없는 예외가 발생했습니다.");

		} finally {
			System.out.println("다시 실행하세요.");

		}
		System.out.println();
		System.out.println("프로그램 정상 종료.");
	}
}
