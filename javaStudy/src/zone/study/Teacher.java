package zone.study;

public class Teacher extends School {
	public Teacher() {
		System.out.println("반 확인 프로그램");
	}

	@Override
	public String getBan(String name) {
		return super.getBan(name) + "반";
	}
}
