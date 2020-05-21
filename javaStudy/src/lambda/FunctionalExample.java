package lambda;

public class FunctionalExample {

	static class SummariesInterfaceClass implements SummariesInterface {
		@Override
		public int sum(int x, int y) {
			return x + y;
		}
	}

	public static void main(String[] args) {
		MyFunctionalInterface mfi = (str, str1) -> {
			return "Hello " + str + ", " + str1;
		};

		String result = mfi.run("Hong", "Go");
		System.out.println(result);

		SummariesInterface si = (a, b) -> {
			return a + b;
		};
		System.out.println(si.sum(3, 5));

		SummariesInterface si2 = new SummariesInterfaceClass();
		si2.sum(10, 30);

	} // end of main
}
