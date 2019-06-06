package com.yedam.control;

public class ForLoop {
	public static void main(String[] args) {
		// for loop
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				if (j % 2 == 0) {
					if (j < i)
						System.out.print("\t\t");
					else
						System.out.print(j + " * " + i + " = " + (j * i) + "\t");
				}
			}
			System.out.println();
		}

		// while loop
		int a = 1;
		while (a < 10) {
			int b = 2;
			while (b < 10) {
				if (b < a)
					System.out.print("\t\t");
				else
					System.out.print(b + " * " + a + " = " + (b * a) + "\t");
				b += 2;
			}
			a++;
			System.out.println();
		}

		// 1 .. 10 multiple
		int sum = 0;
		String str = "1";
		for (int i = 1; i <= 10;) {
			sum += i;
			System.out.println(str + " = " + sum);
			str = str + " + " + ++i;
		}
		System.out.println("=====================================");

		for (int i = 1; i <= 100; i++) {
			System.out.print(String.format("%3d", i) + " ");
			if (i % 10 == 0)
				System.out.println();
		}

//		  1   2   3   4   5   6   7   8   9  10 
//		  *  12  13  14  15  16  17  18  19  20 
//		  *   *  23  24  25  26  27  28  29  30 
//		  *   *   *  34  35  36  37  38  39  40 
//		  *   *   *   *  45  46  47  48  49  50 
//		  *   *   *   *   *  56  57  58  59  60 
//		  *   *   *   *   *   *  67  68  69  70 
//		  *   *   *   *   *   *   *  78  79  80 
//		  *   *   *   *   *   *   *   *  89  90 
//		  *   *   *   *   *   *   *   *   * 100 
		boolean bool = true;
		for (int i = 1; i <= 100; i++) {

			if (bool) {
				System.out.print(String.format("%3d", i) + " ");
				if (i % 10 == 0)
					bool = !bool;
			} else {
				System.out.print(String.format("%3s", "*") + " ");
				if (i % 11 == 0)
					bool = !bool;
			}

			if (i % 10 == 0)
				System.out.println();
		}

//		 *    
//	    ***   
//	   *****  
//	  ******* 
//	 *********
//	  ******* 
//	   *****  
//	    ***   
//	     *    
		bool = false;
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {

				if (i <= 5) {
					if (i + j == 6)
						bool = true;
					if (bool) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
					if (j - i == 4)
						bool = false;

				} else {
					if (i - j == 4)
						bool = true;
					if (bool) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
					if (i + j == 14)
						bool = false;

				}
			}
			System.out.println();
		}

//	(1,1)(1,2)(1,3)(1,4)(1,5)(1,6)(1,7)(1,8)(1,9)
//
//	     (2,2)(2,3)(2,4)(2,5)(2,6)(2,7)(2,8)     
//
//	          (3,3)(3,4)(3,5)(3,6)(3,7)          
//
//	               (4,4)(4,5)(4,6)               
//
//	                    (5,5)                    
//
//	               (6,4)(6,5)(6,6)               
//
//	          (7,3)(7,4)(7,5)(7,6)(7,7)          
//
//	     (8,2)(8,3)(8,4)(8,5)(8,6)(8,7)(8,8)     
//
//	(9,1)(9,2)(9,3)(9,4)(9,5)(9,6)(9,7)(9,8)(9,9)
		bool = false;
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i <= 5) {
					if (i == j)
						bool = !bool;
					if (bool)
						System.out.print("(" + i + "," + j + ")");
					else
						System.out.print("     ");
					if (i + j == 10)
						bool = !bool;
				} else {
					if (i + j == 10)
						bool = !bool;
					if (bool)
						System.out.print("(" + i + "," + j + ")");
					else
						System.out.print("     ");
					if (i == j)
						bool = !bool;
				}
			}
			System.out.println();
			System.out.println();
		}

	} // end of main
} // end of class
