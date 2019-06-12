package generic.test;

class Container2<K, V> {
	private K name;
	private V value;

	public void set(K key, V value) {
		this.name = key;
		this.value = value;
	}

	public K getKey() {
		return name;
	}

	public V getValue() {
		return value;
	}
}

public class Sample2 {
	public static void main(String[] args) {
		Container2<String, String> con1 = new Container2<String, String>();
		con1.set("홍길동", "도적");
		String name1 = con1.getKey();
		String job = con1.getValue();
		System.out.println(name1 + job);

		Container2<String, Integer> con2 = new Container2<>();
		con2.set("홍길동", 35);
		String name2 = con2.getKey();
		Integer age = con2.getValue();
		System.out.println(name2 + age);
	}
}
