package com.yClass.interfacePkg;

public class Example {
	public static void main(String[] args) {
		ImplementC impl = new ImplementC();

		InterfaceA ia = impl;
		ia.methodA();

		InterfaceB ib = impl;
		ib.methodB();

		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
}
