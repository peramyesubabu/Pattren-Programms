package patternprograms;

import java.util.Scanner;

public class DemoTDA3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan=new Scanner(System.in);
		String arr[][]=new String[4][];
		arr[0]= new String[4];
		arr[1]= new String[2];
		arr[2]= new String[3];
		arr[3]= new String[5];
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter name of the class"+i+"Student"+j);
				arr[i][j]=Scan.next();
			}
		}
		System.out.println("Array contents are--------->");
	
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		


	}

}
