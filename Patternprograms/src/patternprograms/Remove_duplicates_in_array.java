package patternprograms;

import java.util.Scanner;

public class Remove_duplicates_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter array length");
		
		int n=Scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array contents");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter element of an array "+i);
			arr[i]=Scan.nextInt();
			
		}
		System.out.println();
		System.out.println("Array contens before shorting");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
		System.out.println();
		System.out.println("arrange array in assending order");
		int help;
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
		{
			
			if(arr[i]>arr[j])
			{
				help=arr[i];
				arr[i]=arr[j];
				arr[j]=help;
			}

		}
			System.out.print(arr[i]+" ");
			}
		System.out.println();
		System.out.println("Create temp array");
		int temp[]=new int[arr.length];
		int j=0;
		temp[0]=arr[0];
		for(int i=1;i<=arr.length-1;i++)
		{
			
				if(arr[i]!=temp[j])
				{
					j++;
					temp[j]=arr[i];
					
				}
			}
		System.out.println("====================");
		for(int i=0;i<=temp.length-1;i++)
		{
			System.out.println(temp[i]+" ");
			
		}
		
		}
	}

		