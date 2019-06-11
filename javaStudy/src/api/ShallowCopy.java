package api;

class Point implements Cloneable {
	int xPos;
	int yPos;

	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}

	public void showPosition() {
		System.out.printf("[%d, %d]", xPos, yPos);
		System.out.println();
	}

	public void changePos(int x, int y) {
		xPos = x;
		yPos = y;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class Rectangle implements Cloneable {
	Point upperLeft;
	Point lowerRight;

	public Rectangle(int x, int y, int x1, int y1) {
		upperLeft = new Point(x, y);
		lowerRight = new Point(x1, y1);
	}

	public void changePos(int x, int y, int x1, int y1) {
		upperLeft.changePos(x, y);
		lowerRight.changePos(x1, y1);
	}

	public void showPosition() {
		System.out.print("좌측상단:");
		upperLeft.showPosition();
		System.out.print("우측하단:");
		lowerRight.showPosition();
		System.out.println();
	}

	protected Rectangle getRect() {
		Rectangle r = null;
		try {
			r = (Rectangle) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return r;
	}
}

public class ShallowCopy {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(1, 1, 9, 9);
		Rectangle cpy = rect.getRect();
		cpy.upperLeft.xPos = 3;
		// cpy.changePos(2, 2, 7, 7);
		rect.upperLeft.showPosition();
		cpy.upperLeft.showPosition();
	}
}
