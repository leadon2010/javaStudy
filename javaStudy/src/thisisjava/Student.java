package thisisjava;

public class Student {
	String name;
	int age;

	Student(String n, int a) {
		name = n;
		age = a;
	}

	@Override
	public int hashCode() {
		return age;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

}
