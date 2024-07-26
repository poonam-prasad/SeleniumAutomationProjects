package com.CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class D02ListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> studentId=new ArrayList<Integer>();
		studentId.add(30);
		studentId.add(10);
		studentId.add(20);
		
		System.out.println(studentId);
		System.out.println("After sorting "+studentId);
		
	
		Collections.sort(studentId);
		System.out.println("After sorting "+studentId);
		Collections.reverse(studentId);
		System.out.println("After Reversing "+studentId);
	}

}
