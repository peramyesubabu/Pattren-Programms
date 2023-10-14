package practice_programs;

public class EqualsIgnoreCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//equalsIgnorecase is used to compare two string by ignoring the cases
		String s1="RAMU";
		String s2="ramu";
		if(s1.equals(s2))
		{
			System.out.println("string are eual");
		}
		else
		{
			System.out.println("strings are not equal");
		}
		System.out.println("============================");
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("string are equal if cases areignored");
		}
	
	else
	{
	System.out.println("strings are not equal even if cases are ignored");	
	}

}
}
