package patternprograms;

import java.util.Scanner;

public class DemoTDA2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner Scan=new Scanner(System.in);
		int arr[][]=new int[4][];
		arr[0]= new int[4];
		arr[1]= new int[2];
		arr[2]= new int[3];
		arr[3]= new int[5];
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter age of the class"+i+"Student"+j);
				arr[i][j]=Scan.nextInt();
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
