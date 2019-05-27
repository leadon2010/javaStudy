package yoon.ch19;

class Point {
	private int xPos;
	private int yPos;

	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}

	@Override
	public boolean equals(Object obj) {
		if (this.xPos == ((Point) obj).xPos && this.yPos == ((Point) obj).yPos)
			return true;
		else
			return false;
	}

}

class Rectangle {
	private Point upperLeft;
	private Point lowerRight;

	public Rectangle(int x, int y, int x1, int y1) {
		upperLeft = new Point(x, y);
		lowerRight = new Point(x1, y1);
	}

	@Override
	public boolean equals(Object obj) {
		// return super.equals(obj);
		if (upperLeft.equals(((Rectangle) obj).upperLeft) && lowerRight.equals(((Rectangle) obj).lowerRight))
			return true;
		else
			return false;
	}

}

public class Ex19 {
	public static void main(String[] args) {
		Point p1 = new Point(3, 5);
		Point p2 = new Point(3, 5);
		if (p1.equals(p2))
			System.out.println("same");
		else
			System.out.println("diff");

		Rectangle r1 = new Rectangle(1, 2, 3, 4);
		Rectangle r2 = new Rectangle(1, 2, 4, 4);
		if (r1.equals(r2))
			System.out.println("same1");
		else
			System.out.println("diff1");

	}
}
