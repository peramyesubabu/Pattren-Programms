package practice_programs;

public class Equalsoparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("krishna");
		String s2=new String("krishna");
		System.out.println("===========================");
		if(s1==s2)
		{
			System.out.println("both string references are equal");
		}
		else
		{
			System.out.println("both string references are not equal");
		}
		System.out.println("equals method==============================");
		if(s1.equals(s2))
		{
			System.out.println("both string  are equal");
		}
		else
		{
			System.out.println("both strings are not equal");
		}

	}

}
