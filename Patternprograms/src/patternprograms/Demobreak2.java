package patternprograms;

public class Demobreak2 {

	public static void main(String[] args)
	{
	for(int i=1;i<=5;i++)
	{
		System.out.println(i);
		if(i==2)
		{
			break;
		}
		
		for(int j=1;j<=5;j++)
		{
			System.out.println(j);
			System.out.println("kodnest");
		}
	}
	}
}
