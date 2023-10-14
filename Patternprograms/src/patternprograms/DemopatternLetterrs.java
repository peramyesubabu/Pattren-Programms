package patternprograms;

public class DemopatternLetterrs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=11;i++)
		{
			for(int j=1;j<=11;j++)
			{
				if(i==1||j==1||j==11||i==6)
				{
			System.out.print("*");	
			}
				else
				{
			System.out.print(" ");
		}
			System.out.println();
			}
			for(int i1=1;i1<=11;i1++)
			{
				for(int j=1;j<=11;j++)
				{
					if(i1==1||j==1||j==11||i1==6||i1==11)
					{
				System.out.print("*");	
				}
					else
					{
				System.out.print(" ");
			}
					System.out.println();
			}
				System.out.println();
		}
			System.out.println();
		}
	}
}

				


