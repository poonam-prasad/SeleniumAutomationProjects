package com.CollectionsDemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,String> maps=new HashMap<>();
		maps.put(1, "Poonam");
		maps.put(2, "Amit");
		maps.put(3, "Myra");
		
		System.out.println(maps);
		
		maps.put(3, "Ahaan");
		
		System.out.println(maps);
		
		if(maps.containsKey(4))
		{
			System.out.println("Key already present");
		}
		else
			maps.put(4, "Avyaan");
		
		System.out.println(maps);
		
		maps.put(5, "Ahaan");
		System.out.println(maps);
		
		System.out.println(maps.get(5));
		
		for(Map.Entry<Integer,String> s: maps.entrySet())
		{
			System.out.println(s);
		}
	}

}
