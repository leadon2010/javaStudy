package ch19;

class Businesss implements Cloneable {
	private String company;
	private String work;

	public Businesss(String company, String work) {
		this.company = company;
		this.work = work;
	}

	public void showBusinessInfo() {
		System.out.println("회사: " + company);
		System.out.println("업무: " + work);
	}

	public Businesss clone() throws CloneNotSupportedException {
		Businesss copy = (Businesss) super.clone();
		return copy;
	}
}

class PersonalInfo implements Cloneable {
	private String name;
	private int age;
	private Businesss bz;

	public PersonalInfo(String name, int age, String company, String work) {
		this.name = name;
		this.age = age;
		bz = new Businesss(company, work);
	}

	public void showPersonalInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		bz.showBusinessInfo();
		System.out.println();
	}

	public PersonalInfo clone() throws CloneNotSupportedException {
		PersonalInfo cpy = (PersonalInfo) super.clone();
		cpy.bz = bz.clone();
		return cpy;
	}

}

class DeepCopyTest {
	public static void main(String[] args) {
		try {
			PersonalInfo org = new PersonalInfo("James", 22, "SimpeSound", "encoding");
			PersonalInfo cpy = org.clone();

			org.showPersonalInfo();
			cpy.showPersonalInfo();

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}// end of main
}// end of class
