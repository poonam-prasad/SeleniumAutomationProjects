package com.FunctionDemos;

import java.util.Scanner;

public class D03NotPassingAndReturning {

	public static int findSquare()
	{
		int no;
		System.out.println("Enter some number");
		Scanner scn=new Scanner(System.in);
		no=scn.nextInt();
		int square=no*no;
		return square;
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findSquare());
	}

}
