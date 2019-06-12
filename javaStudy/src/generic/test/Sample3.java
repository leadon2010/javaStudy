package generic.test;

class Pair<K, V> {
	private K key;
	private V value;

	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}
}

class ChildPair<K, V> extends Pair<K, V> {
	public ChildPair(K key, V value) {
		super(key, value);
	}
}

class OtherPair<K, V> {
	private K key;
	private V value;

	public OtherPair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

}

class Util {
	public static <K, V> V getValue(Pair<K, V> p, V v) {

		return v;
	}
}

public class Sample3 {
	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<>("홍길동", 35);
		Integer age = Util.getValue(pair, "홍길동");
		System.out.println(age);

		ChildPair<String, Integer> child = new ChildPair<>("홍삼원", 20);
		Integer cage = Util.getValue(child, "홍삼원");
		System.out.println(cage);

		OtherPair<String, Integer> other = new OtherPair("홍삼원", 20);
		Integer oage = Util.getValue(other, "홍삼원");
		System.out.println(oage);
	}
}
