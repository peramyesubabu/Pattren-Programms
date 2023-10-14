package linea_rAnd_Binaray_searching;

import java.util.Scanner;

public class Bubble_shorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		}
		System.out.println();
		System.out.println("count number of duplicates in an array");
		int count=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					break;
				}
			}
		}
		System.out.println(count);
		
		

	}

}
