package patternprograms;

public class DemopatternA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=65;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=6;j++)
			{
				if(i==1||i==2||i==3||i==4||i==5&&j!=3&&j!=4&&j!=5&&j!=6||j==1||j==2||j==3&&i!=5||j==4&&i!=5||j==5&&i!=5||j==6&&i!=5)
				
			System.out.print((char)a+" ");
				a++;
			}
			System.out.println();
		}
		}
	}


	


