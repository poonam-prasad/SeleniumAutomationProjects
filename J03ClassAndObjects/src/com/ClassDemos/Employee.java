package com.ClassDemos;

public class Employee {

	int empId;
	String employeeName;
	String gender;
	double basicSalary;


	void displayData()
	{
		System.out.println("Employee id "+empId);
		System.out.println("Emplayee Name "+employeeName);
		System.out.println("gender "+gender);
	}
	
	double calSalary()
	{
		
		double hra,da,pf,net;
		hra=basicSalary*0.20;
		da=basicSalary*0.50;
		pf=basicSalary*0.05;
		
		net=da+hra-pf;
		return net;
	}
}
