package ch19;

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

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return (Point1) super.clone();
	}

}

public class InstanceCloning {
	public static void main(String[] args) {
		Point1 org = new Point1(3, 5);
		Point1 cpy;
		try {
			cpy = (Point1) org.clone();
			org.showPosition();
			cpy.showPosition();
			org = new Point1(3, 4);
			org.showPosition();
			cpy.showPosition();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
