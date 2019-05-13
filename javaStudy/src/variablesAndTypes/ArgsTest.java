package variablesAndTypes;

public class ArgsTest {
	public static void main(String[] args) {
		System.out.println("start");
		funs(1, 2, 3, 4, 5, 6, 7, 8);
	}

	public static void funs(int... a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a.toString());
		}
	}
}
