package generic;

class UtilNumber {
	public static <T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		return Double.compare(v1, v2);// 두 수의 차이를 비교해서 -1, 1, 0 을 리턴하는 메소드
	}
}

public class BoundedTypeParameterExample {
	public static void main(String[] args) {
		int result1 = UtilNumber.compare(10, 20);
		System.out.println(result1);

		int result2 = UtilNumber.compare(4.5, 3);
		System.out.println(result2);
	}
}
