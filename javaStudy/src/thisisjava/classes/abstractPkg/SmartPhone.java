package thisisjava.classes.abstractPkg;

public class SmartPhone extends Phone {

	public SmartPhone() {
	}

	public SmartPhone(String owner) {
		super(owner);
	}

	public void internetSearch() {
		System.out.println("웹서치 합니다.");
	}

	@Override
	public void bell() {
		// TODO Auto-generated method stub
		
	}
}
