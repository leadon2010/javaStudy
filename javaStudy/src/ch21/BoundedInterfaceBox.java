package ch21;

interface Eatable {
	public String eat();
}

class Applei implements Eatable {
	public String toString() {
		return "I am an apple.";
	}

	@Override
	public String eat() {
		return "It tastes so good!";
	}
}

class Boxi<T extends Eatable> {
	private T ob;

	public void set(T o) {
		ob = o;
	}

	// 한 입 먹고 반환하는 행위의 메소드로 수정
	public T get() {
		System.out.println(ob.eat());
		return ob;
	}
}

class BoundedInterfaceBox {
	public static void main(String[] args) {
		Boxi<Applei> box = new Boxi<>();
		box.set(new Applei());

		Applei ap = box.get();
		System.out.println(ap);
	}
}
