package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@interface InsertIntData {
	int data() default 30;
}

class AnnotationEx {
	@InsertIntData
	private int myAge;
	@InsertIntData
	private int defaultAge;

	AnnotationEx() {
//		this.myAge = -1;
//		this.defaultAge = -1;
	}

	int getMyAge() {
		return this.myAge;
	}

	int getDefaultAge() {
		return this.defaultAge;
	}
}

public class AnnotationEx01 {
	public static void main(String[] args) {
		AnnotationEx ex = new AnnotationEx();
		System.out.println(ex.getMyAge());
		System.out.println(ex.getDefaultAge());
	}
}
