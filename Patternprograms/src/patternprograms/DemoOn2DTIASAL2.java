package patternprograms;

import java.util.Scanner;

public class DemoOn2DTIASAL2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter the length of 2D array from keyboard");
		int arr[][]=new int[Scan.nextInt()][Scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println(" Enter element to stored in array index "+i+" "+j);
				arr[i][j]=Scan.nextInt();
			}
		}
		System.out.println("Array contents are---------");
		System.out.println("==========================");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
		System.out.println();

	}
		System.out.println();
	}
}


