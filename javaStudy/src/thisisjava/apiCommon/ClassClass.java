package thisisjava.apiCommon;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Car {
}

interface Action {
	public void execute();
}

class SendAction implements Action {

	@Override
	public void execute() {
		System.out.println("데이터를 보냅니다.");
	}
}

class ReceiveAction implements Action {

	@Override
	public void execute() {
		System.out.println("데이터를 받습니다.");
	}
}

public class ClassClass {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws Exception {
		// Class.forName() 메소드.
		Car car = new Car();
		Class cls = car.getClass();
		System.out.println(cls.getName());
		System.out.println(cls.getSimpleName());
		System.out.println(cls.getPackage().getName());
		System.out.println();
		try {
			Class cls2 = Class.forName("api.Car");
			System.out.println(cls2.getName());
			System.out.println(cls2.getSimpleName());
			System.out.println(cls2.getPackage().getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println();

		// 리플랙션..
		Class cls5 = Class.forName("com.yedam.classes.Account");
		System.out.println("[클래스 이름]");
		System.out.println(cls5.getName());
		System.out.println();
		System.out.println("[싱성자 정보]");
		Constructor[] constructors = cls5.getDeclaredConstructors();
		for (Constructor cons : constructors) {
			System.out.println(cons.getName() + "(");
			Class[] parameters = cons.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}

		System.out.println("[필드 정보]");
		Field[] fields = cls5.getDeclaredFields();
		for (Field fld : fields) {
			System.out.println(fld.getType().getSimpleName() + " " + fld.getName());
		}

		System.out.println("[메소드 정보]");
		Method[] methods = cls5.getDeclaredMethods();
		for (Method met : methods) {
			System.out.print(met.getName() + "(");
			Class[] parameters = met.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
		System.out.println();

		// 동적 객체 생성
//		Class cls7 = Class.forName("api.SendAction");
		Class cls7 = Class.forName("api.ReceiveAction");
		Action action = (Action) cls7.newInstance();
		action.execute();

	}

	static void printParameters(Class[] param) {
		for (int i = 0; i < param.length; i++) {
			System.out.println(param[i].getName());
			if (i < param.length - 1) {
				System.out.print(",");
			}
		}
	}
}
