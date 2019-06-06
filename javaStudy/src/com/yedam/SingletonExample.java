package com.yedam;

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

		// main메소드 호출 시 넘겨주는 인자값 확인하기.
		String[] strAry = { "str1", "str2", "str3" };
		PersonExample.main(strAry);
	}
}

//final 필드와 상수.
//상수 = static final 의 의미가 있다.
class Person {
	final String nation = "Korea";
	final String ssn;
	String name;

	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}

class PersonExample {
	public static void main(String[] args) {
		// main 메소드 호출 시 넘겨지는 인자값 확인하기.
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}

		Person person = new Person("123456789", "박문수");
		System.out.println(person.nation);
		System.out.println(person.ssn);
		System.out.println(person.name);
		// person.nation = "USA";
		// person.ssn = "1111111";
		person.name = "홍길동";
	}
}