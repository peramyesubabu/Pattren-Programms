package patternprograms;

import java.util.Scanner;

public class Demoon2DjaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter the 1D length of the array to create the 2D Integer Jagged array");
		int arr[][]=new int[Scan.nextInt()][];
		System.out.println("Enter 2D length of the array to create 2d Jagged Array");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter 2D length for 1D"+i);
			arr[i]=new int[Scan.nextInt()];
		}
		System.out.println("Enter array elements are.........");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
			System.out.println("Enter an element to store in array index" +i+ " "+j);
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
		System.out.println();
	}
}

