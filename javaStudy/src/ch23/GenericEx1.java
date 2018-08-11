package ch23;

class Persons {
	String id;
	String name;

	Persons(String id, String name) {
		this.id = id;
		this.name = name;
	}

}

class Student extends Persons implements Comparable<Persons> {

	String name;
	int ban;
	int no;
	int koreanScore;
	int englishScore;
	int mathScore;

	int total;

	Student(String na, int b, int n, int k, int e, int m) {
		super(b + "-" + n, na);
		koreanScore = k;
		englishScore = e;
		mathScore = m;
		total = k + e + m;
	}

	@Override
	public int compareTo(Persons o) {
		return 0;
	}

}

public class GenericEx1 {

}
