package operations;

public class Operation {
	public static void main(String[] args) {
		int x = 0;
		x++;
		int y = 0, z;
		z = x + y;
		char chr = (z > 0) ? 'A' : 'B';
		System.out.println(chr);

		System.out.println(z > 5);
	}
}
