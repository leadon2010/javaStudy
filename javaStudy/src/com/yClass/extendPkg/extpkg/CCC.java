package com.yClass.extendPkg.extpkg;

import com.yClass.extendPkg.AAA;

public class CCC extends AAA {
	public CCC() {
		// new 키워드로 생성할 수 없고 , 자식생성자에서 super()로 생성자를 호출할 수 있다.
		super();
		this.name = "dddd";
		this.getName();
	}
}
