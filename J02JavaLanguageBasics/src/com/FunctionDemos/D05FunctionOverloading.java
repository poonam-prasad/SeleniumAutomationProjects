package com.FunctionDemos;

public class D05FunctionOverloading {

	public static void calAddition(int n1,int n2)
	{
		int add=n1+n2;
		System.out.println("Addition is "+add);
	}
	
	public static void calAddition(int n1,int n2,int n3)
	{
		int add=n1+n2+n3;
		System.out.println("Addition is "+add);
	}
	
	public static void calAddition(double n1,double n2)
	{
		double add=n1+n2;
		System.out.println("Addition is "+add);
	}
	
	public static void calAddition(int n1,double n2)
	{
		double add=n1+n2;
		System.out.println("Addition is "+add);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calAddition(1,2,3);
		calAddition(1,2);
		calAddition(2,2.0);
	}

}
