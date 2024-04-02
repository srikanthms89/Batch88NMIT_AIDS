package com.tnsif.day3;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {

 String name,gender;
 int age,tax,income;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter person Details");
		
		System.out.println("Enter Person Name");
		
		name = sc.nextLine();
		
		System.out.println("Enter Person Income");
		income = sc.nextInt();
		
		System.out.println("Enter Person gender");
		gender = sc.next();
		
		System.out.println("Enter Person age");
		age = sc.nextInt();
		System.out.println("Enter Person tax");
		tax = sc.nextInt();

		 Person obj = new Person();
		 obj.setName(name);
		 obj.setIncome(income);
		 obj.setTax(tax);
		 obj.setAge(age);
		 obj.setGender(gender);
		 
		 
		 System.out.println(obj);
	}

}
