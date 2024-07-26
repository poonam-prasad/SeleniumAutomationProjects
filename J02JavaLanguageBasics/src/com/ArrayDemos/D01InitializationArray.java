package com.ArrayDemos;

public class D01InitializationArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks[]= new int[5];
		marks[0]=30;
		marks[1]=60;
		marks[2]=50;
		marks[3]=40;
		marks[4]=10;
		
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks[4]);
		
		int temp;
		for(int i=0; i<marks.length;i++)
		{
			for(int j=i+1;j<marks.length;j++)
			{
				temp=0;                     
				if(marks[i]>marks[j])  //60>50  temp=60, i=50, j=60
					{
					temp=marks[i];
				    marks[i]=marks[j];
				    marks[j]=temp;
				    }
					
			}
			
			System.out.println(marks[i]);
		}
		
			
		}
	}	
		
	
	

