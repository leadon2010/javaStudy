package yoon.ch32;

public class SBox implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	String s;

	public SBox(String s) {
		this.s = s;
	}

	public String get() {
		return s;
	}
}
