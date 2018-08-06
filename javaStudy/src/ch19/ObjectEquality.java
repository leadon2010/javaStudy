package ch19;

class INum {
	private int num;
	private String name;

	public INum(int num, String name) {
		this.num = num;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this.name.length() == ((INum) obj).name.length())
			return true;
		else
			return false;
	}
}

public class ObjectEquality {
	public static void main(String[] args) {
		INum num1 = new INum(10, "aaaa");
		INum num2 = new INum(12, "aaa");
		INum num3 = new INum(10, "bbbb");

		if (num1.equals(num2))
			System.out.println("num1,num2 동일한 값");
		else
			System.out.println("num1,num2 다른 값");

		if (num1.equals(num3))
			System.out.println("num1,num3 동일한 값");
		else
			System.out.println("num1,num3 다른 값");
	}
}
