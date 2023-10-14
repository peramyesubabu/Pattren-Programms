package patternprograms;

import java.util.Scanner;

public class Demo1DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter the 1D length of the array to create the 2D array");
		int arr[][]=new int[Scan.nextInt()][Scan.nextInt()];
		System.out.println("Enter array elements are.........");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
			System.out.println("Enter an element to store in array index"+i+" "+j);
			arr[i][j]=Scan.nextInt();
			}
		}
		System.out.println("Array contents are");
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

		

	


