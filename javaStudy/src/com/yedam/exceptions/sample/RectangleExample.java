package com.yedam.exceptions.sample;

class Point {
	private int xPos;
	private int yPos;

	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}

	@Override
	public boolean equals(Object obj) {
//		return super.equals(obj);
		Point p = (Point) obj;
		if (xPos == p.xPos && yPos == p.yPos)
			return true;
		else
			return false;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}

class Rectangle {
	private Point upperLeft;
	private Point lowerRight;

	public Rectangle(int x1, int y1, int x2, int y2) {
		upperLeft = new Point(x1, y1);
		lowerRight = new Point(x2, y2);
	}

	@Override
	public boolean equals(Object obj) {
//		return super.equals(obj);
		Rectangle r = (Rectangle) obj;
		System.out.println(upperLeft + "/" + r.upperLeft);
		if (upperLeft == r.upperLeft && lowerRight == r.lowerRight) {
//		if (upperLeft.equals(r.upperLeft) && lowerRight.equals(r.lowerRight)) {
			return true;
		} else {
			return false;
		}
	}

}

public class RectangleExample {
	public static void main(String[] args) {
		Point p1 = new Point(3, 5);
		Point p2 = new Point(3, 5);
		System.out.println(p1.equals(p2));

		Rectangle r1 = new Rectangle(1, 2, 3, 4);
		Rectangle r2 = new Rectangle(1, 2, 3, 4);
		System.out.println(r1.equals(r2));
	}
}
