package ch19;

class Business implements Cloneable {
	private String company;
	private String work;

	public Business(String company, String work) {
		this.company = company;
		this.work = work;
	}

	public void showBusiness() {
		System.out.println("회사: " + company);
		System.out.println("업무: " + work);
	}
}

class PersonInfo implements Cloneable {
	private String name;
	private int age;
	private Business bz;

	public PersonInfo(String name, int age, String compay, String work) {
		this.name = name;
		this.age = age;
		bz = new Business(compay, work);
	}

	public void showPersonInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		bz.showBusiness();
		System.out.println();
	}

	public void setPersonInfo(String name, int age, String compay, String work) {
		this.name = name;
		this.age = age;
		bz = new Business(compay, work);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}

public class Ex192 {
	public static void main(String[] args) throws CloneNotSupportedException {
		PersonInfo pi = new PersonInfo("LEE", 10, "CMP", "WRK");
		PersonInfo p2 = (PersonInfo) pi.clone();

		pi.showPersonInfo();
		p2.showPersonInfo();

		pi.setPersonInfo("KIM", 20, "CMP2", "WRK2");

		pi.showPersonInfo();
		p2.showPersonInfo();

	}
}
