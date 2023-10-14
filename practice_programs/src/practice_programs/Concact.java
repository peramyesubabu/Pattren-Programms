package practice_programs;

public class Concact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="radha";
		String s2="krishna";
		String s3=s1+s2;
		String s4=s1+s2;
		if(s3==s4)
		{
			System.out.println("refences are equal");
		}
		else
		{
			System.out.println("refences are not equal");
		}
		System.out.println("========================");
		if(s3.equals(s4))
		{
			System.out.println("string are equal");
		}
		else
		{
			System.out.println("string are not equal");
		}
		

	}

}
