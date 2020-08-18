package classes.abstract_class;

public abstract class Animal {

	String species;

	public Animal() {
	}

	public Animal(String species) {
		this.species = species;
	}

	public void showInfo() {
		System.out.println("종류는 " + species);
	}

	public void breathe() {
		System.out.println("숨을 쉰다.");
	}

	public abstract void sound(); // 추상메소드.

}
