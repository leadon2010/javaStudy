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

		int num1 = 10;
		int num2 = 20;
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + (num1 * num2));
		System.out.println("num1 / num2 = " + ((double) num1 / (double) num2));

		int num3 = 0;
		// num3++ -> num3 = num3 + 1;
		// ++num3 -> num3 = num3 + 1;
		System.out.println(num3++);
		System.out.println(num3);

		int num11 = 10;
		long num12 = 234;
		// num11 = num11 + num12;
		num11 += num12;
		System.out.println(num11);

		int num13 = 10;
		//num13 = num13 * 3.5;
		num13 *= 3.5;
		System.out.println(num13);

	}
}
