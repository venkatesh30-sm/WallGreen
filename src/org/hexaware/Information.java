package org.hexaware;

public class Information {

	public void stuId() {
		
		System.out.println("student id is 1234");

	}
	
	public static void main(String[] args) {
		
		Information i=new Information();
		i.stuId();
		EmployeeDetails d=new EmployeeDetails();
		d.empName();
		
	}
}
