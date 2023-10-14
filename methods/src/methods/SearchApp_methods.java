package methods;

import java.util.Scanner;

public class SearchApp_methods {

	public static void main(String[] args) 
	{
		System.out.println("method-1");
		Search S=new Search();
		S.linearsearching_method1();
		System.out.println("===================");
		System.out.println("method-2");
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
	S.linearsearching_method2(arr,key);
	System.out.println("====================");
	System.out.println("method-3");
		int ref=S.linearsearching_method3();
		if(ref>=0)
		{
			System.out.println("key found at array index"+ref);
		}
		else
		{
			System.out.println("key not found");
		}
		System.out.println("===================");
		System.out.println("method-4");
		Scanner scan1=new Scanner(System.in);
		System.out.println("Ener array length");
		int n1 =scan1.nextInt();
		int arr1[]=new int[n1];
		System.out.println("Enter array elements into the array");
		for(int i=0;i<=arr1.length-1;i++)
		{
			System.out.println("enter array element"+i);
			arr1[i]=scan.nextInt();
		}
		System.out.println("================");
		System.out.println("Array comtents are:");
		for(int i=0;i<=arr1.length-1;i++)
		{
			System.out.println(arr1[i]+" ");
		}
		System.out.println("enter key to search");
		int key1=scan.nextInt();
		
		int ref2=S.linearsearching_method4(arr1, key1);
		if(ref2>=0)
		{
			System.out.println("key found at array index"+ref2);
		}
		else
		{
			System.out.println("key not found");
		}

	}

}
