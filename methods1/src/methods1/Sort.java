package methods1;

import java.util.Scanner;

public class Sort {
	void BubbleSorting_metohd1()
	{
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter array length");
		int n=Scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array elemnts");
		for(int i=0;i<=n-1;i++)
		{
			System.out.println("Enter element of an array"+i);
			arr[i]=Scan.nextInt();
			
		}
		System.out.println();
		System.out.println("Array contents before shorting");
		for(int i=0;i<=n-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		int help;
		for(int i=0;i<=(arr.length-2);i++)
		{
			for(int j=0;j<=(arr.length-2-i);j++)
			{
				if(arr[j]>arr[j+1])
				{
					help=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=help;
				}
			}
		}
		System.out.println();
		System.out.println("Array contents after shorting");
		for(int i=0;i<=n-1;i++)
		{
			System.out.print(arr[i]+" ");
			
		}
		return;
		
	}
	
	void BubbleSorting_metohd2(int arr[])
	{

		int help;
		for(int i=0;i<=arr.length-2;i++)
		{
			for(int j=0;j<=arr.length-2-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					help=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=help;
				}
			}
		}
		System.out.println();
		System.out.println("Array contents after shorting");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
			
		
		
		
	}
		return;
		
	
}
	int[] BubbleSorting_metohd3()
	{
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter array length");
		int n=Scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array elemnts");
		for(int i=0;i<=n-1;i++)
		{
			System.out.println("Enter element of an array"+i);
			arr[i]=Scan.nextInt();
			
		}
		System.out.println();
		System.out.println("Array contents before shorting");
		for(int i=0;i<=n-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		int help = 0;
		for(int i=0;i<=(arr.length-2);i++)
		{
			for(int j=0;j<=(arr.length-2-i);j++)
			{
				if(arr[j]>arr[j+1])
				{
					help=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=help;
					
					
				}
			}
			
			//return arr;
		}
		return arr;
		
	}
	
	int[] BubbleSorting_metohd4(int arr2[])
	{
		int help1 = 0;
		for(int i=0;i<=(arr2.length-2);i++)
		{
			for(int j=0;j<=(arr2.length-2-i);j++)
			{
				if(arr2[j]>arr2[j+1])
				{
					help1=arr2[j];
					arr2[j]=arr2[j+1];
					arr2[j+1]=help1;
					
					
				}
			}
			
			
		}
		return arr2; 
	}
}
		