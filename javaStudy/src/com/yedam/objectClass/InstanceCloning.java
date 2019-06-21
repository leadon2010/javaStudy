package com.yedam.objectClass;

class Points implements Cloneable {
	private int xPos;
	private int yPos;

	public Points(int x, int y) {
		xPos = x;
		yPos = y;
	}

	public void showPosition() {
		System.out.printf("[%d, %d]", xPos, yPos);
		System.out.println();
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}

public class InstanceCloning {
	public static void main(String[] args) {
		Points org = new Points(3, 5);
		Points cpy;

		try {
			cpy = (Points) org.clone();
			org.showPosition();
			cpy.showPosition();
			System.out.println(org + "/" + cpy);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
