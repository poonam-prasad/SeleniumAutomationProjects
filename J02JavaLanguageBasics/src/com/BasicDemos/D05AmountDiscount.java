package com.BasicDemos;

import java.util.Scanner;

public class D05AmountDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int amount;
		double discount,netAmount;
		
		System.out.println("Enter amount");
		Scanner scn=new Scanner(System.in);
		amount=scn.nextInt();
		discount=amount*0.1;
		netAmount=amount-discount;
		
		System.out.println("Discount is "+discount);
		System.out.println("Net amount "+netAmount);
	}

}
