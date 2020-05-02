package org.hexaware;

import org.cts.Details;

public class EmployeeDetails {

	public void empName() {
		System.out.println("emp name is karthik");

	}
	
	public static void main(String[] args) {
		
		EmployeeDetails e=new EmployeeDetails();
		e.empName();
		
		Details d=new Details();
		d.courseDuration();
	}
}