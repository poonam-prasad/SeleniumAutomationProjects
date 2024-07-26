package com.Loops;

import java.util.Scanner;

public class D06ForLoop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no,i;
		System.out.println("Enter number");
		Scanner scn = new Scanner(System.in);
		no=scn.nextInt();
				
		for(i=1;i<=no;i++)
		{
			System.out.println(i);
		}
	}

}
