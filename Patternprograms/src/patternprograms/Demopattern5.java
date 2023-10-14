package patternprograms;

public class Demopattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=5;i++)
		{
			int a=65;
			for(int j=5;j>=i;j--)
			{
				
				System.out.print((char)(a+j)+" ");
				a+=2;
			}
			System.out.println();
	

	}

}
}
