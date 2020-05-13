package classes.abstract_class;

public abstract class Animal {
	
	String species;
	
	public Animal() {
		
	}
	
	public void breathe() {
		System.out.println("숨을 쉰다.");
	}
	
	public abstract void sound(); // 추상메소드.

}
