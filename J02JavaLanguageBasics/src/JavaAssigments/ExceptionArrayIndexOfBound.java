package JavaAssigments;

import java.util.Scanner;

public class ExceptionArrayIndexOfBound {

	public static void main(String[] args) {
		 int arr[]= {1,2,3,4,5};
		 int index;
		 Scanner scn=new Scanner(System.in);
		 System.out.println("Enter Index: ");
		 index=scn.nextInt();
		 try 
		 {
		 System.out.println(arr[index]);
		 }
		 catch(ArrayIndexOutOfBoundsException ex)
		 {
			 System.out.println("Error: Index is Out of Bounds!");
		 }
		
		 System.out.println("Program Ends");
		
	}

}
