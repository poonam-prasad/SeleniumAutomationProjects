package com.FunctionDemos;

public class D04MultipleReturn {
	
	public static int findMax(int no1, int no2)
	{
		if(no1>no2)
		{
			return no1;
		}
		else
			return no2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no1=6,no2=3;
		int max=findMax(no1,no2);
		
		System.out.println("Maxmimum no is "+max);

	}

}
