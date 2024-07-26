package JavaAssigments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSortAscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> students=new ArrayList<Integer>();
		
		students.add(30);
		students.add(10);
		students.add(5);
		students.add(15);
		students.add(20);
		
		/*for(String studentsList:students)
		{
			System.out.println(studentsList);
		}*/
		
		for(int i=0;i<students.size();i++)
		{
			System.out.println(students.get(i));
		}
		
		Collections.sort(students);
		System.out.println(students);
		
	}

}
