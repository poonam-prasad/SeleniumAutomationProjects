package com.BasicDemos;

import java.util.Scanner;

public class D01_IF_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount;
		double discount=0,netAmount=0;
		
		System.out.println("Enter amount");
		Scanner scn=new Scanner(System.in);
		amount=scn.nextInt();
		
		if(amount>=1000) 
		{	
		discount=amount*0.1;
		}
		else
			{discount=amount*0.05;
			
			}
			
		netAmount=amount-discount;
		
		System.out.println("Discount is "+discount);
		System.out.println("Net amount "+netAmount);
	
	}

}
