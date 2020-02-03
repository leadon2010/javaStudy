package thisisjava.apiCommon.object;

class Key {
	public int number;

	public Key(int number) {
		this.number = number;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Key) {
			Key compareKey = (Key) obj;
			if (this.number == compareKey.number)
				return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return number;
	}

}

class Member implements Cloneable {
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;

	public Member(String id, String name, String password, int age, boolean adult) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public Member getMember() throws CloneNotSupportedException {
		return (Member) super.clone();
//		Member cloned = null;
//		try {
//			cloned = (Member) clone();
//		} catch (CloneNotSupportedException e) {
//			e.printStackTrace();
//		}
//		return cloned;
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			if (id.equals(member.id))
				return true;
		}
		return false;
	}

//	@Override
//	public String toString() {
//		return id + "," + name + "," + password + "," + age + "," + adult;
//	}

}

public class ObjectExample {
	public static void main(String[] args) {
		Member original = new Member("blue", "홍길동", "12345", 25, true);
		Member cloned = null;
		try {
			cloned = (Member) original.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		original.age = 30;
		System.out.println(original.age + "/" + cloned.age);
		System.out.println("복제객체의 값");
		System.out.println(cloned);
		System.out.println("원본객체의 값");
		System.out.println(original);

	}
}
