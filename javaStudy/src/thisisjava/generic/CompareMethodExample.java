package thisisjava.generic;

public class CompareMethodExample {
	public static void main(String[] args) {
		Pair<Integer, String> p1 = new Pair<>(1, "Apple");
		Pair<Integer, String> p2 = new Pair<>(1, "Apple");
		boolean result1 = Util.compare(p1, p2);
		if (result1) {
			System.out.println("논리적으로 동등한 객체입니다.");
		} else {
			System.out.println("논리적으로 동등하지 않은 객체입니다.");
		}

		Pair<Integer, String> p3 = new Pair<>(1, "hong");
		Pair<Integer, String> p4 = new Pair<>(2, "hong");
		boolean result2 = Util.compare(p3, p4);
		if (result2) {
			System.out.println("논리적으로 동등한 객체입니다.");
		} else {
			System.out.println("논리적으로 동등하지 않은 객체입니다.");
		}
		
	}
}
