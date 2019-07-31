package thisisjava.nestedClass;

class Problem {
	static String s;

	static class Inner {
		void testMethod() {
			s = "Set from Inner";
		}
	}
}

public class NestedClassSample {
	public static void main(String[] args) {
		Problem.Inner iner = new Problem.Inner();
		iner.testMethod();
		System.out.println(Problem.s);

		String returnStr = "02-1234-5678".replaceAll("[^0-9]", "");
		System.out.println(returnStr);
	}
}
