package com.yedam.tire;

import com.yedam.hankook.*;
import com.yedam.kumho.*;

public class TireSample {

	public static void main(String[] args) {
		SnowTire st = new SnowTire();
		BigWideTire bt = new BigWideTire();
		st.showType();
		bt.showType();
		com.yedam.hankook.Tire tr = new com.yedam.hankook.Tire();
		tr.showTire();
	}

}
