package classes.abstract_class;

public class Bird extends Animal {
	
	public Bird() {
	}
	
	public Bird(String species) {
		super(species);
	}

	@Override
	public void sound() {
		System.out.println("짹짹");
	}

}
