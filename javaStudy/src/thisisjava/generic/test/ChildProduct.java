package thisisjava.generic.test;

public class ChildProduct<T, M, C> extends Product<T, M> {
	private C company;

	public void setCompany(C compnay) {
		this.company = company;
	}

	public C getCompany() {
		return company;
	}
}