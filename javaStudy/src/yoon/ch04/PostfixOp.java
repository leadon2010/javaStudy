package yoon.ch04;

public class PostfixOp {
	public static void main(String[] args) {
		int num = 5;
		System.out.println(--num);
		System.out.println(--num);
		System.out.println(num);

		System.out.println(--num);
		System.out.println(--num);
		System.out.println(num);

		System.out.println("==================");
		System.out.println(num++);
		System.out.println(num++);
		System.out.println(num);

		System.out.println(num--);
		System.out.println(num--);
		System.out.println(num);
	}
}
