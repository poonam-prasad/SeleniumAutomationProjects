package com.CollectionsDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionSetDemo {

	public static void main(String[] args) {
	
		Set<String> students=new HashSet<>();
		students.add("Poonam");
		students.add("Amit");
		students.add("Amit");
		
		System.out.println(students.size());
		System.out.println(students);
		System.out.println("-------------------");
		Iterator<String> itr=students.iterator();
		for(int i=1;i<=students.size();i++)
		{
			String st1=itr.next();
			System.out.println(st1);
		}
		
		
		/*String st=itr.next();
		System.out.println(st);
		 st=itr.next();
		System.out.println(st);
		*/
		/*if(itr.hasNext())
		{
		st1=itr.next();
		System.out.println(st1);
		}
		else
			System.out.println("Reached at last element");*/
		
		
	}

}
