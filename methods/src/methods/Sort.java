package methods;

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
			return;
		}
	}
	
	void BubbleSorting_metohd2(int arr[],int n)
	{

		int help;
		for(int i=0;i<=n-2;i++)
		{
			for(int j=0;j<=(n-2-i);j++)
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
			return;
		}
	}
		
		
	}
	


		