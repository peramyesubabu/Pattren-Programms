package patternprograms;

public class Demo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=11;i++)
		{
			for(int j=1;j<=11;j++)
			{
				if(i==1||j==1||i==11||j==11||i==6||j==6||i==j||i+j==7||i-j==5||j-i==5||i+j==17||i+j==12)
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

	}

}
