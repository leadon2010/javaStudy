package thisisjava.generic.test;

class Container1<T> {
	private T name;

	public void set(T name) {
		this.name = name;
	}

	public T get() {
		return name;
	}

}

public class Sample1 {
	public static void main(String[] args) {
		Container1<String> con1 = new Container1<>();
		con1.set("홍길동");
		String str1 = con1.get();
		System.out.println(str1);

		Container1<Integer> con2 = new Container1<>();
		con2.set(50);
		Integer int1 = con2.get();
		System.out.println(int1);
	}
}
