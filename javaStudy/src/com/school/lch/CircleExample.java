package com.school.lch;

public class CircleExample {
	public static void main(String[] args) {
		Circle c = new Circle();
//		c.radius = -5;
		c.setRadius(-5);
		double result = c.getArea();
		System.out.println("result: " + result);
	}

}
