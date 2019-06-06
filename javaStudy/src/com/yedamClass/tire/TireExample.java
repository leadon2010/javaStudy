package com.yedamClass.tire;

import com.yedamClass.tire.hankook.SnowTire;
import com.yedamClass.tire.kumho.BigWideTire;
//import com.yedamClass.tire.hankook.Tires;
//import com.yedamClass.tire.kumho.Tires;

public class TireExample {
	public static void main(String[] args) {
		SnowTire sTire = new SnowTire();
		sTire.showType();
		BigWideTire bTire = new BigWideTire();
		bTire.showType();

		com.yedamClass.tire.hankook.Tires tires = new com.yedamClass.tire.hankook.Tires();
		tires.start();
		tires.setVelocity(40);
		System.out.println(tires.currentVelocity() + "km/h 입니다.");

		com.yedamClass.tire.kumho.Tires tires2 = new com.yedamClass.tire.kumho.Tires();
		tires2.start();
		tires2.setSpeed(50);
		System.out.println(tires2.currentSpeed() + "km/h 입니다.");
	}
}
