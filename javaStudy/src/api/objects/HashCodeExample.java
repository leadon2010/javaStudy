package api.objects;

import java.util.Objects;

public class HashCodeExample {
	static class Student {
		int sno;
		String name;

		Student(int sno, String name) {
			this.sno = sno;
			this.name = name;
		}

		@Override
		public int hashCode() {
			return Objects.hash(sno, name);
		}

	}

	public static void main(String[] args) {
//		HashCodeExample hc = new HashCodeExample();
		Student s1 = new Student(1, "Hong");
		Student s2 = new Student(1, "Hong");

		System.out.println(Objects.hash(s1));
		System.out.println(Objects.hash(s2));
		System.out.println(s2.hashCode());
	}

}
