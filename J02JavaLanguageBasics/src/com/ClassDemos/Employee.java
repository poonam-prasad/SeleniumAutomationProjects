package com.ClassDemos;

public class Employee {

	private int empid;
	private String empName;
	private double basicSalary;
	private String gender;
	private static String company;
	
	public static void setCompany(String c)
	{
		company=c;
	}
	
	public Employee() {
		empid=100;
		empName="Poonam";
		basicSalary=50000;
		gender="Female";
		System.out.println("Constructor Called");
		
		
	}
	
	public Employee(int id,String nm, double bs,String g)
	{
		empid=id;
		empName=nm;
		basicSalary=bs;
		gender=g;
		System.out.println("Parameritized constructor called");
	}
	public void setEmpId(int id) //Mutator function/Setter function
	{
		empid=id;
	}
	
	public int getEmpId() //Accessor function/Getter function
	{
		return empid;
	}
	
	/*public void setEmployeeData()
	{
		
	}*/
	void displayData() //Facilitator function
	{
		System.out.println("Employee id: "+empid);
		System.out.println("Employee Name: "+empName);
		System.out.println("Basic Salary: "+basicSalary);
		System.out.println("Gender: "+gender);
		System.out.println("Company: "+company);
	}
	
	double calculateSalary()
	{
		double da,hra,pf,net;
		
		da=basicSalary*0.50;
		hra=basicSalary*0.20;
		pf=basicSalary*0.05;
		net=da+hra-pf;
		
		return net;
	}

	}


