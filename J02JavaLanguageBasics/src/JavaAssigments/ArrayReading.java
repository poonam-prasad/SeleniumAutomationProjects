package JavaAssigments;

import java.util.Scanner;

public class ArrayReading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]=new int[5];
		Scanner scn=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter elements");
			arr[i]=scn.nextInt();
		}
		
		for(int n:arr)
		{
			System.out.println(n);
		}
	}

}
