package zone.study;

/*
 * 전체프로그램에서 단 하나의 객체만을 만들도록 보장해야 할때...단 하나만 생성된다고 해서 Singleton.
 * 클래스 외부에서는 new 연산자로 생성자를 호출할 수 없도록 막는다.
 */
class Singleton {
	private static Singleton singleton = new Singleton();

	private Singleton() {

	}

	static Singleton getInstance() {
		return singleton;
	}
}

public class SingletonExample {
	public static void main(String[] args) {
		// Singleton obj1 = new Singleton(); // private 접근수준이 안맞음.
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();

		if (obj1 == obj2)
			System.out.println("같은 Singleton 입니다.");
		else
			System.out.println("다른 Singleton 입니다.");

	}

}
