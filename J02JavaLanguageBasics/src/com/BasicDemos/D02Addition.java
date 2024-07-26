package com.BasicDemos;

public class D02Addition {
	public static void main(String[] args) {
		int no1=10, sum, no2=20;
		sum=no1+no2;
		System.out.println("Addition of two nos="+sum);
		
		no1+=5;
		System.out.println("No.1="+no1);
		
		no1++;
		System.out.println("No.1="+no1);
		
		no1--;
		System.out.println("No.1="+no1);
		
		no1=5;
		no2=2;
		
		double ans = (double)no1/no2;
		
		System.out.println("Answer is"+ans);
		
		double remainder = no1%no2;
		
		System.out.println("Remainder is"+remainder);
		
	}
}
