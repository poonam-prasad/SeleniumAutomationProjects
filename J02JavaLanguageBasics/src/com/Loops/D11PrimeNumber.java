package com.Loops;

import java.util.Scanner;

public class D11PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no,i;
		Scanner scn=new Scanner(System.in);
		no=scn.nextInt();
		
		for( i=2;i<=no;i++)
		{
			if(no%i==0)
				break;
		}
		
		if(no==i)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not Prime");
		}
		

	}

}
