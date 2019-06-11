package generic;

class Pair<K, V> {
	private K key;
	private V value;

	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}
}

class Utils {
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		return keyCompare && valueCompare;
	}
}

public class CompareMethodExample {
	public static void main(String[] args) {
		Pair<Integer, String> p1 = new Pair<Integer, String>(1, "사과");
		Pair<Integer, String> p2 = new Pair<Integer, String>(1, "사과");
		boolean result = Utils.<Integer, String>compare(p1, p2); // Utils.compare(p1, p2);
		if (result)
			System.out.println("논리적으로 동등한 객체입니다.");
		else
			System.out.println("논리적으오 동등하지 않은 객체입니다.");

		Pair<String, String> s1 = new Pair<String, String>("user1", "사과");
		Pair<String, String> s2 = new Pair<String, String>("user2", "사과");
		boolean result1 = Utils.compare(s1, s2);
		if (result1)
			System.out.println("논리적으로 동등한 객체입니다.");
		else
			System.out.println("논리적으오 동등하지 않은 객체입니다.");

	}
}
