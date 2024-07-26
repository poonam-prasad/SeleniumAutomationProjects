package com.BasicDemos;

import java.util.Scanner;

public class D03OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number;
		
		System.out.println("Enter number");
		Scanner scn=new Scanner(System.in);
		number=scn.nextInt();
		
		if(number%2==0)
		{
			System.out.println("Its Even number "+number);
		}
		
		else
			System.out.println("Its Odd number");
		scn.close();
	}

}
