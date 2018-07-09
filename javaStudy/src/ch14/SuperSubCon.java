package ch14;

class SuperCLS1 {
	public SuperCLS1() {
		System.out.println("I'm Super Class");
	}
}

class SubCLS1 extends SuperCLS1 {
	public SubCLS1() {
		System.out.println("I'm Sub Class");
	}
}

public class SuperSubCon {
	public static void main(String[] args) {
		SubCLS1 sub = new SubCLS1();
	}
}
