package yoon.ch23;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

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
		name = na;
		ban = b;
		no = n;
		koreanScore = k;
		englishScore = e;
		mathScore = m;
		total = k + e + m;
	}

	@Override
	public int compareTo(Persons o) {
		return id.compareTo(o.id);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", ban=" + ban + ", no=" + no + ", koreanScore=" + koreanScore
				+ ", englishScore=" + englishScore + ", mathScore=" + mathScore + ", total=" + total + "]";
	}

}

public class GenericEx1 {
	public static void main(String[] args) {
		HashMap<String, Student> map = new HashMap<>();
		map.put("1-1", new Student("test1", 1, 1, 100, 100, 100));
		map.put("1-2", new Student("test2", 1, 2, 90, 90, 90));
		map.put("2-1", new Student("test3", 2, 1, 80, 80, 80));
		map.put("2-2", new Student("test4", 2, 2, 70, 70, 70));

		Student s1 = map.get("1-1");
		System.out.println(s1.name);
		Set<String> set = map.keySet();
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
		// System.out.println(map.values());
		Iterator<Student> isr = map.values().iterator();
		while (isr.hasNext()) {
			System.out.println(isr.next());
		}

	}// end of main

}// end of class
