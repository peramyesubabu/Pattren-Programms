package demoprograms;

public class Demostrings2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("rama");
		String s2=new String("rama");
		if(s1==s2)
		{
			System.out.println("References are equal");
			
		}
		else
		{
			System.out.println("References are unequal");
		}
		System.out.println();
		if(s1.equals(s2))
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings are unequal");
		}

	}
	
	

}
