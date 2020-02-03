package thisisjava.generic.test;

public class CompareMethodExample {
	public static void main(String[] args) {

		Pair<Integer, String> p1 = new Pair<Integer, String>(1, "사과");
		Pair<Integer, String> p2 = new Pair<Integer, String>(1, "사과");
		boolean result = Util.compare(p1, p2); // Util.<Integer, String>compare(p1, p2);
		if (result)
			System.out.println("논리적으로 동등한 객체입니다.");
		else
			System.out.println("논리적으오 동등하지 않은 객체입니다.");

		Pair<String, String> s1 = new Pair<String, String>("user1", "사과");
		Pair<String, String> s2 = new Pair<String, String>("user2", "사과");
		result = Util.compare(s1, s2);
		if (result)
			System.out.println("논리적으로 동등한 객체입니다.");
		else
			System.out.println("논리적으오 동등하지 않은 객체입니다.");

	}
}
