package patternprograms;
import java.util.Scanner;
public class DemoTDA 
{
	public static void main(String[]args)
	{
		Scanner Scan = new Scanner(System.in);
	String arr[][]=new String[2][3];

	for(int i=0; i<=arr.length-1; i++)
	{
		for(int j=0; j<=arr[i].length-1; j++)
		{
			System.out.println("Enter the name of the Bank "+i+" customer "+j);
			
			arr[i][j] = Scan.next();
			}
	}
	System.out.println("Array contents are.........>");
	for(int i=0; i<=arr.length-1; i++)
	{
		for(int j=0; j<=arr[i].length-1; j++)
		{
			System.out.print(arr[i][j]+" ");
		}
	}
		System.out.println();
	}
}
	
