package com.tnsif.day3;

public class Person{

	//Data members
	private String name ;
	private String gender;
	private int age;
	private int aadhar;
	private int income;
	
	//Getter and setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAadhar() {
		return aadhar;
	}
	public void setAadhar(int aadhar) {
		this.aadhar = aadhar;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	
	//Default constructor
	public Person() {
		super();
	}
	//parameterized constructor
	public Person(String name, String gender, int age, int aadhar, int income) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.aadhar = aadhar;
		this.income = income;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", age=" + age + ", aadhar=" + aadhar + ", income="
				+ income + "]";
	}
	
	//To String method
	
	
	
	
}
