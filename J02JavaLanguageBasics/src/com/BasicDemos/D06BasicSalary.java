package com.BasicDemos;

import java.util.Scanner;

public class D06BasicSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double basicSalary,dearnessAllowance,hra,providentFund,netSalary,total;
		
		System.out.println("Enter Basic Salary");
		Scanner scn=new Scanner(System.in);
		basicSalary=scn.nextDouble();
		dearnessAllowance=basicSalary*0.5;
		hra=basicSalary*0.2;
		providentFund=basicSalary*0.05;
		total=basicSalary+dearnessAllowance+hra;
		netSalary=total-providentFund;
		
		System.out.println("Net salary is "+netSalary);
		
	}

}
