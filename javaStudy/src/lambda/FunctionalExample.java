package lambda;

public class FunctionalExample {
	public static void main(String[] args) {
		MyFunctionalInterface mfi = (str) -> {
			return "Hello " + str;
		};

		String result = mfi.run("Hong");
		System.out.println(result);

	}
}
