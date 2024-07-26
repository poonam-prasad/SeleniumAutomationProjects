package com.BasicDemos;

import java.util.Scanner;

public class D04CalculateSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no,sq;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		no=scn.nextInt();
		
		
		sq= no*no;
		
		System.out.println("Square of "+no+" is "+" = "+sq);
	}

}
