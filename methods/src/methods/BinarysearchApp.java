 package methods;

import java.util.Scanner;

public class  BinarysearchApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearch bs=new BinarySearch(); 
		bs.Binarysearching_method1();
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
		bs.Binarysearching_method2(arr, key);
	int	ref=bs.Binarysearching_method3();
	if(ref>0)
	{
		System.out.println("key found at index"+ref);
	}
	else
	{
		System.out.println("key not found");
		
	}

	
	Scanner scan1=new Scanner(System.in);
	System.out.println("Ener array length");
	int n1 =scan1.nextInt();
	int arr1[]=new int[n1];
	System.out.println("Enter array elements into the array");
	for(int i=0;i<=arr1.length-1;i++)
	{
		System.out.println("enter array element"+i);
		arr1[i]=scan1.nextInt();
	
	System.out.println("================");
	System.out.println("Array comtents are:");
	for(int i1=0;i1<=arr1.length-1;i1++)
	{
		System.out.println(arr1[i]+" ");
	}
	System.out.println("enter key to search");
	int key1=scan1.nextInt();
	int ref2=bs.Binarysearching_method4(arr1, key1);
	if(ref2>0)
	{
		System.out.println("key found at index"+ref2);
	}
	else
	{
		System.out.println("key not found");
		
	}

	
	

}
}
}

