package patternprograms;

public class Printnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j++)
			{
				System.out.print(" ");
			}
			for(int R=5;R<=i;R++)
			{
				System.out.println("*");
			}
			System.out.println();
		}
	}
}
		

	
