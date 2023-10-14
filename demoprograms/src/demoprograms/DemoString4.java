package demoprograms;

public class DemoString4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="om";
		String s2="kar";
		String s3="om"+"kar";
		String s4="om"+"kar";
		if(s3==s4)
		{
			System.out.println("References are equal");
			
		}
		else
		{
			System.out.println("References are unequal");
		}
		if(s1.equals(s2))
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings  are unequal");	
		}

	}

}
