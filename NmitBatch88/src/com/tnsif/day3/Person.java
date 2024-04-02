package com.tnsif.day3;

public class Person {
	
	
	//Data members
		private String name;
		private int income;
		private String gender;
		private int age;
		private int tax;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIncome() {
			return income;
		}
		public void setIncome(int income) {
			this.income = income;
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
		public int getTax() {
			return tax;
		}
		public void setTax(int tax) {
			this.tax = tax;
		}
		
		//Default constructor
		public Person() {
			super();
		}
		public Person(String name, int income, String gender, int age, int tax) {
			super();
			this.name = name;
			this.income = income;
			this.gender = gender;
			this.age = age;
			this.tax = tax;
		}
		@Override
		public String toString() {
			return "Person [name=" + name + ", income=" + income + ", gender=" + gender + ", age=" + age + ", tax="
					+ tax + "]";
		}
		
		
		
		

}
