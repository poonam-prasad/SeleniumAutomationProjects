package com.BasicDemos;

import java.util.Scanner;

public class D03CalculateArea {

	public static void main(String[] args) {
		int rd;
		Scanner scn= new Scanner(System.in);
		
		System.out.println("Enter Radius");
		rd=scn.nextInt();
		
		double area=3.142*rd*rd;
		System.out.println("Area is"+area);

	}

	
}
