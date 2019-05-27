package yoon.ch19;

class Point1 implements Cloneable {
	private int xPos;
	private int yPos;

	public Point1(int x, int y) {
		xPos = x;
		yPos = y;
	}

	public void showPosition() {
		System.out.printf("[%d, %d]", xPos, yPos);
		System.out.println();
	}

	public void changePos(int a, int b) {
		xPos = a;
		yPos = b;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}

class PointCase implements Cloneable {
	private Point1 p1;
	private Point1 p2;

	public PointCase(int a, int b, int c, int d) {
		p1 = new Point1(a, b);
		p2 = new Point1(c, d);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// return super.clone();
		PointCase pc = (PointCase) super.clone();
		pc.p1 = (Point1) p1.clone();
		pc.p2 = (Point1) p2.clone();
		return pc;
	}

	public void changeCase(int a, int b, int c, int d) {
		p1.changePos(a, b);
		p2.changePos(c, d);
	}

	public void showCase() {
		System.out.println("pc1 의 값: ");
		p1.showPosition();
		System.out.println("pc2 의 값: ");
		p2.showPosition();
	}

}

public class InstanceCloning {
	public static void main(String[] args) {
		Point1 org = new Point1(3, 5);
		Point1 cpy;
		try {
			cpy = (Point1) org.clone();
			// org.showPosition();
			// cpy.showPosition();

			PointCase pc1 = new PointCase(1, 2, 3, 4);
			PointCase pc2;

			pc2 = (PointCase) pc1.clone();
			// pc1.showCase();
			// pc2.showCase();

			pc1.changeCase(3, 4, 5, 6);
			pc1.showCase();
			System.out.println();
			pc2.showCase();

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}// end of main
}// end of class
