package patternprograms;

public class Demohouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for( int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++)
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
				if(i==1||i==5||j==1||j==19||j==9)
				
			{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
				System.out.println();
			}
			System.out.println();
		}
	}

			

