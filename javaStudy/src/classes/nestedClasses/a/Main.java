package classes.nestedClasses.a;

import java.util.Date;

public class Main {
	public static void main(String[] args) {
		Aclass a = new Aclass();
		Aclass.Bclass b = a.new Bclass();
		b.fieldB = 2;
		b.methodB();

		Aclass.Cclass c = new Aclass.Cclass();
		c.fieldC = 3;
//		c.staticC = 3;
		c.methodC();
//		c.staticC();

		Aclass.Cclass.staticC = 3;
		Aclass.Cclass.staticC();

		a.methodA();

	}
}
