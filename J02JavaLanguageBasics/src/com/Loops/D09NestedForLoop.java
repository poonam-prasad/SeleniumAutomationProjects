package com.Loops;

public class D09NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=5;i++) //Outer loop
		{
			for(int j=1;j<=i;j++) //Inner loop
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		//For every iteration of outer loop, inner loop gets executed for its complete scope
	}

}
