package com.tnsif.day2;

public class OperatorsDemo {
	public static void main(String args[]) {
		int a = 10;
		int b = 20;
		 int x = 10;
		System.out.println("a and b value before the operations: " + a + " " + b);

		++a; //11
		int c = ++a + b + a--;   //12 + 20 +12
		System.out.println("c value after the operations: " + c);  //44 42 41 

		int d = c++ + a + b--;    // 44 + 11 +20 
System.out.println("d value after the operations: " + d); 

		System.out.println("a , b,c,d values after the operations: " + a + " " + b + " " + c + " " + d);
				
		//Ternary operator demonstration
		  x = (10 == x) ? 1 : 0;	
		  System.out.println(x);  //1
	}
}
