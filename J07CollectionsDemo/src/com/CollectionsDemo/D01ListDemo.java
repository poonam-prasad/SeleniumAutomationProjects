package com.CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class D01ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> studentName=new ArrayList<String>();
		studentName.add("Poonam");
		studentName.add("Amit");
		studentName.add("Myra");
		studentName.add("Ahaan");
		studentName.add("Avyaan");
		
		System.out.println("Total no of students = "+studentName.size());
		System.out.println(studentName.get(2));
		
		for(int i=0;i<studentName.size();i++)
		{
			System.out.println(i+" "+studentName.get(i));
		}
		Collections.sort(studentName);
		System.out.println("After sorting");
		System.out.println(studentName);
		
		studentName.remove(0);
		studentName.remove("Poonam");
		System.out.println(studentName);
		
		/*for(String name:studentName)
		{
			System.out.println(name);
		}*/
	}

}
