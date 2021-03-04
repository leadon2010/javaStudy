package annotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrintAnnotationExample {
	public static void main(String[] args) {
		Service service = new Service();
		
		System.out.println("class1: " + Service.class);
		System.out.println("class2: " + service.getClass());
		
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		declaredMethods = service.getClass().getDeclaredMethods();

		for (Method method : declaredMethods) {
			if (method.isAnnotationPresent(PrintAnnotation.class)) {
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
				System.out.println("[" + method.getName() + "]");
				for (int i = 0; i < printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
				}
				System.out.println();
			}
			try {
				method.invoke(new Service());
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		}
	}
}
