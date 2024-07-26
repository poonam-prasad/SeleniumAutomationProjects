package com.InheritanceDemos;

public class Employee {


		// TODO Auto-generated method stub

		private int empId;
		private String employeeName;
		private String gender;
		private double basicSalary;
	
		public Employee()
		{
			empId = 100;
			employeeName = "Anu";
			basicSalary = 50000;
			gender = "Female";
			
			System.out.println("Default Constructor called!!!");
		}
		
		public Employee(int id, String nm, double bs, String gn)
		{empId = id;
		employeeName = nm;
		basicSalary = bs;
		gender = gn;
		System.out.println("Parameterized Constructor Called!!!");
			
		}
	
		public Employee(int id, String nm, double bs)
		{
			empId = id;
			employeeName = nm;
			basicSalary = bs;
			gender = "Male";
			System.out.println("Second Parameterized Constructor Called!!!");
		}
		public void displayData()
		{
			System.out.println("Employee id "+empId);
			System.out.println("Emplayee Name "+employeeName);
			System.out.println("gender "+gender);
			System.out.println("Basic salary "+basicSalary);
			
		}
	

	public double calculateSalary() {
		// TODO Auto-generated method stub
		double hra,da,pf,net;
		hra=basicSalary*0.20;
		da=basicSalary*0.50;
		pf=basicSalary*0.05;
		
		net=basicSalary+da+hra-pf;
		return net;
	
	}
	public String toString()
	{
		return empId+employeeName+gender+basicSalary;
		
	}
	

}
