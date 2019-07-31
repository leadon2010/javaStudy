package thisisjava.generic;

public class Util {
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<>();
		box.set(t);
		return box;
	}

	public static <K, V> boolean compare(Pair<K, V> pair1, Pair<K, V> pair2) {
		boolean keyCompare = pair1.getKey().equals(pair2.getKey());
		boolean valueCompare = pair1.getValue().equals(pair2.getValue());

		return keyCompare && valueCompare;
	}
}