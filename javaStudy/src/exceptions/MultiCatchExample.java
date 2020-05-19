package exceptions;

public class MultiCatchExample {
	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;

		try {
			data1 = args[0];
			data2 = args[1];

			int val1 = Integer.parseInt(data1);
			int val2 = Integer.parseInt(data2);
			int result = val1 + val2;
			System.out.println("결과는 " + result);

		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("매개변수의 수가 부족하거나 숫자로 변환할 수 없습니다.");
		} catch (Exception e1) {
			System.out.println("알수 없는 예외 발생.");
		} finally {
			System.out.println("다시 실행하세요.");
		}

		System.out.println("end of program.");
	}
}
