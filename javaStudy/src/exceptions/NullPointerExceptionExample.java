package exceptions;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		String data = null;
		try {
			System.out.println(data.toString());
		} catch (NullPointerException e) {
			e.printStackTrace();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}
		System.out.println("end of program");
	}
}
