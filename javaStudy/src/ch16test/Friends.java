package ch16test;

class Friends implements Comparable {
	private String name;
	private String phone;
	private int age;

	public Friends(String na, String ph, int ag) {
		name = na;
		phone = ph;
		age = ag;
	}

	public void showInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("전화: " + phone);
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	@Override
	public int compareTo(Object o) {
		Friends f = (Friends) o;
		// return this.age - f.age;
		return this.name.compareTo(f.name);
	}

	@Override
	public boolean equals(Object obj) {
		// return super.equals(obj);
		if (this == obj)
			return true;
		else
			return false;
	}

}

class UnivFriends extends Friends {
	private String major;

	public UnivFriends(String na, String ma, String ph, int age) {
		super(na, ph, age);
		major = ma;
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("전공: " + major);
	}
}

class CompFriends extends Friends {
	private String department;

	public CompFriends(String na, String de, String ph, int age) {
		super(na, ph, age);
		department = de;
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("부서: " + department);
	}

}
