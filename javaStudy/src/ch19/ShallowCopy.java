package ch19;

class Point2 implements Cloneable {
	private int xPos;
	private int yPos;

	public Point2(int x, int y) {
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

class Rectangler2 implements Cloneable {
	private Point2 upperLeft;
	private Point2 lowerRight;

	public Rectangler2(int x, int y, int x1, int y1) {
		upperLeft = new Point2(x, y);
		lowerRight = new Point2(x1, y1);
	}

	public void changePos(int x, int y, int x1, int y1) {
		upperLeft.changePos(x, y);
		lowerRight.changePos(x1, y1);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// return super.clone();
		Rectangler2 copy = (Rectangler2) super.clone();
		copy.upperLeft = (Point2) upperLeft.clone();
		copy.lowerRight = (Point2) lowerRight.clone();
		return copy;
	}

	public void showPosition() {
		System.out.println("좌측상단: ");
		upperLeft.showPosition();
		System.out.println("우측하단: ");
		lowerRight.showPosition();
		System.out.println();
	}
}

public class ShallowCopy {
	public static void main(String[] args) {
		Rectangler2 org = new Rectangler2(1, 1, 9, 9);
		Rectangler2 cpy;

		try {
			org.showPosition();
			cpy = (Rectangler2) org.clone();
			cpy.showPosition();

			org.changePos(2, 2, 7, 7);
			org.showPosition();
			cpy.showPosition();

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
