package practice_programs;

import java.util.Scanner;

public class Largestelementinanarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter array length");
		int n=scan.nextInt();
	int arr[]=new int[n];
	System.out.println("enter  elements in to the array");
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.println("enter array elemnt in index"+i);
		arr[i]=scan.nextInt();
	}
	System.out.println("=================");
	System.out.println("Array contents before sorting");
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println("===================");
	//sorting above array in assending order
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]>arr[j])
				{
					int help=arr[i];
					arr[i]=arr[j];
					arr[j]=help;
				}
				
			}
		}
		System.out.println("Array contents after sorting");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("===================");
		System.out.println("Printing largest element in an array");
		int small=arr[0];
		for(int i=0;i<=arr.length-1;i++)
		{
			if(small>arr[i])
			{
				small=arr[i];
			}
		
		}
		System.out.println(small);
		

	}

}
