package thisisjava.classes;

/*
 * 전체프로그램에서 단 하나의 객체만을 만들도록 보장해야 할때...단 하나만 생성된다고 해서 Singleton.
 * 클래스 외부에서는 new 연산자로 생성자를 호출할 수 없도록 막는다.
 */
class Singleton {
	private static Singleton singleton = new Singleton();

	// 생성자를 외부에서 호출하지 못하도록 private 으로 변경.
	private Singleton() {

	}

	// 메소드로 접근해서 객체를 하나 만들도록 한다.
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

		System.out.println("============[Persona]==================");
		// main메소드 호출 시 넘겨주는 인자값 확인하기.
		String[] strAry = { "str1", "str2", "str3" };
		PersonaExample.main(strAry);

		System.out.println("============[Earth]==================");
		EarthExample.main();
		
		// import 설명 ==> TireExample.java

	}
}

//final 필드와 상수. => Persona.class
//상수 = static final 의 의미가 있다. => Earth.class
class Persona {
	final String nation = "Korea";
	final String ssn;
	String name;

	public Persona(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}

class PersonaExample {
	public static void main(String[] args) {

		Persona person = new Persona("123456789", "박문수");
		System.out.println(person.nation);
		System.out.println(person.ssn);
		System.out.println(person.name);
		// person.nation = "USA"; // 값을 변경하려면 에러발생.
		// person.ssn = "1111111"; // 값을 변경하려면 에러발생.
		person.name = "홍길동"; // final 필드가 아니어서 변경가능.
		// main 메소드 호출 시 넘겨지는 인자값 확인하기.
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}

	}
}

class Earth {
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;

	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
}

class EarthExample {
	public static void main() {
		System.out.println("지구의 반지름: " + Earth.EARTH_RADIUS + " km");
		System.out.println("지구의 표면적: " + Earth.EARTH_SURFACE_AREA + " km^2");
	}
}