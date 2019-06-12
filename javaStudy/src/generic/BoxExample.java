package generic;

<<<<<<< HEAD
=======
class Box {
	private Object object;

	public void set(Object object) {
		this.object = object;
	}

	public Object get() {
		return object;
	}
}

class Apple {

}

class Orange {

}

>>>>>>> branch 'master' of https://github.com/leadon2010/javaStudy.git
public class BoxExample {
	public static void main(String[] args) {
		Box box = new Box();
		box.set("홍길동");
		String str = (String) box.get();
		System.out.println(str);

		box.set(new Apple());
		Apple apple = (Apple) box.get();
		System.out.println(apple);
	}
}
