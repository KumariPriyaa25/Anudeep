package com.member;

public class manager {
	public class Manager extends member {
		private String department;
		
		public Manager(String name,int age,int phone_number, String address, double salary, String department) {
			
			super(name,age,phone_number,address,salary);
			this.department = department;
		}
		
		public void getDepartment() {
			System.out.println("department : "+ department);
		}
	}
}
