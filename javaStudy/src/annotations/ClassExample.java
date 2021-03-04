package annotations;

import java.lang.reflect.Method;

public class ClassExample {
	public static void main(String[] args) {

		try {
			Class<?> cls = Class.forName("annotations.Service");
			Object obj = cls.newInstance();
			Method[] methods = obj.getClass().getDeclaredMethods();

			methods = Service.class.getDeclaredMethods();
			for (Method method : methods) {
				method.invoke(obj);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		callObject(Service.class);
		System.out.println(Service.class);
		callObject(new Service());
		System.out.println(new Service());
	}

	public static void callObject(Object obj) {
		System.out.println(obj.getClass().getName());
	}
}
