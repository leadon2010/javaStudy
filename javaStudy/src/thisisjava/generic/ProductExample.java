package thisisjava.generic;

class Product<T, M> {
	private T kind;
	private M model;

	public T getKind() {
		return kind;
	}

	public void setKind(T kind) {
		this.kind = kind;
	}

	public M getModel() {
		return model;
	}

	public void setModel(M model) {
		this.model = model;
	}

}

class Television {

}

class Car {

}

public class ProductExample {
	public static void main(String[] args) {

		Product<Television, String> product1 = new Product<Television, String>();
		product1.setKind(new Television());
		product1.setModel("스마트TV");
		Television tv = product1.getKind();
		String tvStr = product1.getModel();

		Product<Car, String> product2 = new Product<Car, String>();
		product2.setKind(new Car());
		product2.setModel("디젤");
		Car car = product2.getKind();
		String carStr = product2.getModel();

	}
}
