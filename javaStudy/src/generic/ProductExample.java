package generic;

class ProductApple {
	private Apple kind;
	private String model;

	public Apple getKind() {
		return kind;
	}

	public void setKind(Apple kind) {
		this.kind = kind;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
}

class Product<T, M> {
	private T type;
	private M model;

	public void setType(T type) {
		this.type = type;
	}

	public T getType() {
		return type;
	}

	public void setModel(M model) {
		this.model = model;
	}

	public M getModel() {
		return model;
	}
}

class ChildProduct<T, M, C> extends Product<T, M> {
	private C company;

	public C getCompany() {
		return this.company;
	}

	public void setCompany(C company) {
		this.company = company;
	}
}

public class ProductExample {
	public static void main(String[] args) {
		Product<Apple, String> product = new Product<Apple, String>();
		product.setType(new Apple(1000));
		product.setModel("사과");
		Apple type = product.getType();
		String model = product.getModel();
		System.out.println(type + model);

		Product<Orange, String> po = new Product<Orange, String>();
		po.setType(new Orange(2500));
		po.setModel("오렌지");

	}

	public static void nonGeneric() {
		ProductApple product = new ProductApple();
		product.setKind(new Apple(1000));
		product.setModel("사과입니다");

		Apple apple = product.getKind();
		String str = product.getModel();

		System.out.println(apple + str);

	}
}
