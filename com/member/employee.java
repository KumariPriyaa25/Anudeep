package com.member;

public class employee {
	public class Employee extends member {
		private String specialization;
		
		public Employee(String name,int age,int phone_number, String address, double salary, String specialization) {
			
			super(name,age,phone_number,address,salary);
			this.specialization = specialization;
		}
		
		public void getSpecialization() {
			System.out.println("specialization : "+ specialization);
		}
	}
}
