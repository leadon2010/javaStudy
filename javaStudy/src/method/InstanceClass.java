package method;

class SingleTon {
	private static SingleTon st = new SingleTon();

	private SingleTon() {
	};

	static SingleTon getInstance() {
		return st;
	}

	void getSingleName() {
		System.out.println("singleton method");
	}
}

public class InstanceClass {
	public static void main(String[] args) {
		SingleTon s = SingleTon.getInstance();
		SingleTon t = SingleTon.getInstance();
		if (s == t) {
			System.out.println("same instance");
		} else {
			System.out.println("different instance");
		}
		s.getSingleName();
	}
}
