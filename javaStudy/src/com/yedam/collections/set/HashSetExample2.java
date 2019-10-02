package com.yedam.collections.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));

		int size = set.size();
		System.out.println("객체수: " + size);
	}
}
