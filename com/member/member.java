package com.member;

public class member {
	private String name;
	private int age;
	private int phone_number;
	private String address;
	private double salary;
	
	
	public member(String name,int age,int phone_number, String address, double salary) {
		this.name = name;
		this.age = age;
		this.phone_number = phone_number;
		this.address = address;
		this.salary = salary;
	}
	
	public void printSalary() {
		System.out.println("salary : "+ salary);
	}
	
	public void showDetails() {
		
		System.out.println("name : "+ name);
		System.out.println("age : "+ age);
		System.out.println("phone : "+ phone_number);
		System.out.println("address : "+ address);
	}
}
