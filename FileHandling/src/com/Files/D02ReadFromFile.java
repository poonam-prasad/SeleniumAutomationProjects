package com.Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class D02ReadFromFile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
       
		File file=new File("Demo.txt");
		Scanner scn =new Scanner(file);
		 
		while(scn.hasNext())
		{
			System.out.println(scn.nextLine());
		}

	}

}
