package thisisjava.classes;

public class UnivFriends extends Friends {
	private String univ;
	private String major;

	public UnivFriends(String name, String phone, String univ, String major) {
		super(name, phone);
		this.univ = univ;
		this.major = major;
	}

	@Override
	public String toString() {
		return "UnivFriends [univ=" + univ + ", major=" + major + "]";
	}

}
