package methods1;

import java.util.Scanner;
public class Binarysearch
{
	void Binarysearching_method1()
	{
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
		int low=0;
		int high=arr.length-1;
		int mid;
		while(low<=arr.length-1)
		{
			 mid=(low+high)/2;
			 if(key==arr[mid])
			 {
				System.out.println("key found at index"+mid); 
				return;
			 }
			 else if(key>arr[mid])
			 {
				 low=mid+1;
				 high=high;
			 }
			 else
			 {
				 low=low;
				 high=mid-1;
			 }
		}
		System.out.println("key not found");
	}
void Binarysearching_method2(int arr[],int key)
{
	int low=0;
	int high=arr.length-1;
	int mid;
	while(low<=arr.length-1)
	{
		 mid=(low+high)/2;
		 if(key==arr[mid])
		 {
			System.out.println("key found at index"+mid); 
			return;
		 }
		 else if(key>arr[mid])
		 {
			 low=mid+1;
			 high=high;
		 }
		 else
		 {
			 low=low;
			 high=mid-1;
		 }
	}
	System.out.println("key not found");
	
	
}

int Binarysearching_method3()
{
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
	int low=0;
	int high=arr.length-1;
	int mid;
	while(low<=arr.length-1)
	{
		 mid=(low+high)/2;
		 if(key==arr[mid])
		 {
			 return mid;
		 }
		 else if(key>arr[mid])
		 {
			 low=mid+1;
			 high=high;
		 }
		 else
		 {
			 low=low;
			 high=mid-1;
		 }
	}
	return -1;
	
}
int Binarysearching_method4(int arr1[], int key1)
{
	int low=0;
	int high=arr1.length-1;
	int mid;
	while(low<=arr1.length-1)
	{
		 mid=(low+high)/2;
		 if(key1==arr1[mid])
		 {
			 return mid;
		 }
		 else if(key1>arr1[mid])
		 {
			 low=mid+1;
			 high=high;
		 }
		 else
		 {
			 low=low;
			 high=mid-1;
		 }
	}
	return -1;
	
	
}
public static void main(String[] args) 
{
	// TODO Auto-generated method stub
	Binarysearch bs=new Binarysearch(); 
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






			 



