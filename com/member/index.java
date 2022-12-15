package com.member;

public class index {
	public class Manager extends member {
		Employee emp = new Employee("admin",26,"9824356172","Block-D",70000,"DB");
		manager man = new manager("admin1",34,"7624357261","noida",60000,"teacher");
		
		System.out.println("Employee Details: ");
		
		emp.showDetails();
		emp.getSpecialization();
		emp.printSalary();
		System.out.println("Details: ");
		
		man.showDetails();
		man.getDepartment();
		mman.printSalary();
	}
}
