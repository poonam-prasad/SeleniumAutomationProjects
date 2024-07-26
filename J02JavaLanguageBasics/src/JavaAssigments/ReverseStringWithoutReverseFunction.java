package JavaAssigments;

public class ReverseStringWithoutReverseFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Poonam";
		String revName="";
		
		System.out.println("Entered String is = "+name);
		
		for(int i=(name.length()-1);i>=0;i--)
		{
			revName=revName+name.charAt(i);
		}
		
		System.out.println("Reversed name is = "+revName);

	}

}
