package generic;

public class Utils {
	public static <T> Box<T> boxing(T t) {

		Box<T> box = new Box<T>();
		box.set(t);

		return box;
	}
}
