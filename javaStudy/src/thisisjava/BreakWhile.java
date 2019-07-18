package thisisjava;

public class BreakWhile {
	public static void main(String[] args) {
		while (true) {
			int select = (int) ((Math.random() * 6) + 1);
			if (select == 6)
				break;
			else
				System.out.println(select);
		}
	}
}
