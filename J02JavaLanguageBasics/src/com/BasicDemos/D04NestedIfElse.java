package com.BasicDemos;

import java.util.Scanner;

public class D04NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double amount, discount, netAmount;
		
		System.out.print("Enter Amount ");
		Scanner scn=new Scanner(System.in);
		amount=scn.nextDouble();
		
		if(amount<1000)
		{
			discount=amount*0.02;
		}
		else if(amount>=1000 && amount<3000)
		{
			discount=amount*0.05;
		}
		
		else if(amount>=3000 && amount>5000)
		{
			discount=amount*0.10;
		}
		else
			discount=amount*0.15;
		
		netAmount=amount-discount;
		
		System.out.println("Discount "+discount);
		System.out.println("Net Amount is "+netAmount);	
		
	}

}
