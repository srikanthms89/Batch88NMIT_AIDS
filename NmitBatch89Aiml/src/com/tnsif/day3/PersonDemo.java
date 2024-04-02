package com.tnsif.day3;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    String name,gender;
    int income,age ,aadhar;
    
    System.out.println("Enter person name");
    name = sc.nextLine();
    
    System.out.println("Enter person gender");
    gender = sc.next();
    
    System.out.println("Enter person income");
    income = sc.nextInt();
    
    System.out.println("Enter person age");
    age = sc.nextInt();

    System.out.println("Enter person aadhar");
    aadhar = sc.nextInt();
    
	
    Person  obj = new Person();
    obj.setName(name);
    obj.setIncome(income);
    obj.setAge(age);
    obj.setAadhar(aadhar);
    obj.setGender(gender);
    
    
     System.out.println(obj);
    
    
	}

}
