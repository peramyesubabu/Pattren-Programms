package patternprograms;

public class Demopatterns13 {

	public static void main(String[] args)
	{
	for(int i=1;i<=5;i++)
	{
		for(int j=5;j>=i;j--)
			
		{
			System.out.print(" ");
		}
		for(int k=1;k<=(2*i-1);k++)
		{
		System.out.print("*");
		}
		for(int l=1;l<=10;l++)
		{
			System.out.print("-");
		}
		System.out.println(); 
	}
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=19;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	}
}
	
	

	