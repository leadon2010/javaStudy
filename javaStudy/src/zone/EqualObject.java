package zone;

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

	public Rectangle(int x1, int y1, int x2, int y2) {
		upperLeft = new Point(x1, y1);
		lowerRight = new Point(x2, y2);
	}

	@Override
	public boolean equals(Object obj) {
//		if (this.upperLeft == ((Rectangle) obj).upperLeft && this.lowerRight == ((Rectangle) obj).lowerRight)
		if (this.upperLeft.equals(((Rectangle) obj).upperLeft) && this.lowerRight.equals(((Rectangle) obj).lowerRight))
			return true;
		else
			return false;
	}
}

public class EqualObject {
	public static void main(String[] args) {
		Point num1 = new Point(10, 12);
		Point num2 = new Point(20, 12);
		Rectangle num3 = new Rectangle(5, 8, 10, 12);
		Rectangle num4 = new Rectangle(5, 8, 10, 12);

		if (num1.equals(num2))
			System.out.println("num1, num2 동일함. ");
		else
			System.out.println("num1, num2 다름. ");
		if (num3.equals(num4))
			System.out.println("num3, num4 동일함. ");
		else
			System.out.println("num3, num4 다름. ");

	}

}
