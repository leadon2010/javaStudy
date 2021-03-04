package annotations;

import java.lang.reflect.Field;

public class DumpMethods {

	public double d;

	public static void main(String args[]) {

		try {

			Class<?> cls = Class.forName("annotations.DumpMethods");

			Field fld = cls.getField("d");

			DumpMethods f2obj = new DumpMethods();

			System.out.println("d = " + f2obj.d);

			fld.setDouble(f2obj, 12.34);

			System.out.println("d = " + f2obj.d);

		} catch (Throwable e) {

			System.err.println(e);

		}

	}
}
