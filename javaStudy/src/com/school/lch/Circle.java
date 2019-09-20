package com.school.lch;

public class Circle {
	private double radius;

	void setRadius(double radius) {
		if (radius < 0)
			this.radius = 0;
		else
			this.radius = radius;
	}

	double getArea() {
		return Math.PI * radius * radius;
	}
}
