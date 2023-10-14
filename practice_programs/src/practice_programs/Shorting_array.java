package practice_programs;

import java.util.Scanner;

public class Shorting_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Takingh the length of an array");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array elements in to the array");
		for(int i=0;i<=arr.length-1;i++) 
		{
			System.out.println("Enter element in an array"+i);
			arr[i]=scan.nextInt();
		}
		System.out.println();
		System.out.println("Array contents before shorting");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println(" Array contents after the shoring");
		for(int i=0;i<=n-2;i++)
		{
			for(int j=0;j<=n-2-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int help=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=help;
				}
			}
		}
		System.out.println();
		for(int j=0;j<=arr.length-1;j++)
		{
			System.out.print(arr[j]+" ");
		}
		System.out.println();
		System.out.println("Enter key to the search");
		int key=scan.nextInt();
		int low=0;
		int high=arr.length-1;
		int mid;
		while(low<=arr.length-1)//while(low<=high)
		{
			mid=(low+high)/2;
			if(key==arr[mid])
			{
				System.out.println("key found at array index"+mid);
			}
			else if(key>arr[mid])
			{
				low=mid+1;
				high=high;
			}
			else if(key<arr[mid])
			{
				low=low;
				high=mid-1;
			}
		}
		System.out.println("key not found");
			
		}
}

		