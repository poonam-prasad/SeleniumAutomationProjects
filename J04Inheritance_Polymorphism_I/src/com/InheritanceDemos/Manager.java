package com.InheritanceDemos;

public class Manager extends Employee {

	private double sales;
	private double rate;
	
	public Manager()
	{
		sales=0;
		rate=0;
	}
	
	public Manager(int id,String nm,double bs,String gn,double s,double r)
	{
		super(id,nm,bs,gn);
		sales=s;
		rate=r;
		
	}
	
	public double calculateInsentive()
	{
		return sales*rate;
	}
	
	public double calculateSalary()
	{
		return super.calculateSalary()+calculateInsentive();
	}
	
	public void displayData()
	{	super.displayData();
		System.out.println("Sales is "+sales);
		System.out.println("Rate is "+rate);
	}
	
	public String toString()
	{   
		
		return super.toString()+"Sales is "+sales+"Rate is "+rate;
	}
}
