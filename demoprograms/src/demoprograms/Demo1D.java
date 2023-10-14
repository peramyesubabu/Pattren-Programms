package demoprograms;

import java.util.Scanner;

public class Demo1D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan=new Scanner(System.in);
		System.out.println("Taking  input as a array length and creating 1D array  ");
		int arr[][]=new int[Scan.nextInt()][Scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter elements are stored in to the array index"+i+j);
			arr[i][j]=Scan.nextInt();
			}
		}
		System.out.println("Array contents are..............//-");
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

		
