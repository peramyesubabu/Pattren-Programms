package practice_programs;

public class CompareTo_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="karna";
		String s2="arjun";
		if(s1.compareTo(s2)>0)
		{
			System.out.println("String s1 is grater");
		}
		else if(s1.compareTo(s2)<0)
		{
			System.out.println("Sytring s2 is grater");
		}
		else
		{
			System.out.println("Both strings are equal");
		}
	}

}
