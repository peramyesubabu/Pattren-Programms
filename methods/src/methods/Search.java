package methods;

import java.util.Scanner;

public class Search 
{
	void linearsearching_method1()
	{
		//System.out.println("method-1");
		Scanner scan=new Scanner(System.in);
		System.out.println("Ener array length");
		int n =scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array elements into the array");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("enter array element"+i);
			arr[i]=scan.nextInt();
		}
		System.out.println("================");
		System.out.println("Array comtents are:");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println("enter key to search");
		int key=scan.nextInt();
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]==key)
			{
				System.out.println("key found at array index"+i);
				return;
			}
			
			}
		System.out.println("key not found");
		}
	
	void linearsearching_method2(int arr[],int key) 
	{
		
	for(int i=0;i<=arr.length-1;i++)
	{
	if(arr[i]==key)
	{
	System.out.println("key found at index"+i);
	return;
	}
}
		System.out.println("key not found");
	}
	int linearsearching_method3()
	{
		//System.out.println("method-3");
		Scanner scan=new Scanner(System.in);
		System.out.println("Ener array length");
		int n =scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array elements into the array");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("enter array element"+i);
			arr[i]=scan.nextInt();
		}
		System.out.println("================");
		System.out.println("Array comtents are:");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println("enter key to search");
		int key=scan.nextInt();
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]==key)
			{
				
				return i;
			}
			
			}
		return -1;
		
		}
	int linearsearching_method4(int arr1[],int key1)
	{
		for(int i=0;i<=arr1.length-1;i++)
		{
			if(arr1[i]==key1)
			{
				
				return i;
			}
			
			}
		return -1;
		
		
	}
		
	}

		
	



