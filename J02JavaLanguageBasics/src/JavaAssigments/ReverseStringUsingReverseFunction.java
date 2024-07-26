package JavaAssigments;

public class ReverseStringUsingReverseFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Poonam";
		
		System.out.println("Entered String is = "+name);
		
		StringBuilder strBuild=new StringBuilder();
		strBuild.append(name);
		
		strBuild.reverse();
		
		System.out.println("Reversed string is "+strBuild);
		
		

	}

}
