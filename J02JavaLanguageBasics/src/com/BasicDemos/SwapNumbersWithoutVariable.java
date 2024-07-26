package com.BasicDemos;

import java.util.Scanner;

public class SwapNumbersWithoutVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   
	      System.out.println("Enter two numbers");
	      
      Scanner scn=new Scanner(System.in);
      
      int a=scn.nextInt();
      int b=scn.nextInt();
    
      System.out.println("Before Swapping "+"a= "+a+" b= "+b);
      
      a = a + b;
      b = a - b;
      a = a - b;
   
          
      System.out.println("After Swapping "+"a= "+a+" b= "+b);
     
      
	}

}
