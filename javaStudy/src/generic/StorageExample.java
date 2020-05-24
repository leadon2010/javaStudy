package generic;

interface Storage<T> {
	public void add(T item, int index);

	public T get(int index);
}

class StorageImpl<T> implements Storage<T> {
	private T[] array;

	public StorageImpl(int capacity) {
		this.array = (T[]) new Object[capacity];
	}

	@Override
	public void add(T item, int index) {
		array[index] = item;
	}

	@Override
	public T get(int index) {
		return array[index];
	}

}

public class StorageExample {
	public static void main(String[] args) {
		Storage<Student> storage = new StorageImpl<>(100);
		storage.add(new Student("학생"), 0);
		Student student = storage.get(0);
		System.out.println(student.getName());
	}
}
