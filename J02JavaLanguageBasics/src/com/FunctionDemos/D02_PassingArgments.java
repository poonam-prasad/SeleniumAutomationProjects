package com.FunctionDemos;

public class D02_PassingArgments {

	public static int calculateAddition(int a, int b)
	{
		int sum=a+b;
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=calculateAddition(10,20);
		System.out.println(sum);
		System.out.println(calculateAddition(10,20));
	}

}
