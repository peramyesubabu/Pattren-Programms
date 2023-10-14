package methods1;

import java.util.Scanner;


public class SortApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sort bs=new Sort();
		bs.BubbleSorting_metohd1();
		System.out.println("=====================");
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
		bs.BubbleSorting_metohd2(arr);
		System.out.println("===============================");
		//method -3
		int arr1[] = bs.BubbleSorting_metohd3();
		System.out.println("array after sorting");
		for(int i=0;i<=arr1.length-1;i++)
		{
		
			System.out.print(arr1[i]+" ");
		}
		System.out.println("===========================");
		//method-4
		Scanner Scan1=new Scanner(System.in);
		System.out.println("Enter array length");
		int n2=Scan1.nextInt();
		int arr2[]=new int[n2];
		System.out.println("Enter array elemnts");
		for(int i=0;i<=arr2.length-1;i++)
		{
			
			
			arr2[i]=Scan1.nextInt();
			
		}
		
		int arr3[]=bs.BubbleSorting_metohd4(arr2);
		System.out.println("Array after sorting");
		for(int i=0;i<=arr3.length-1;i++)
		{
			
		
			System.out.print(arr3[i]+" ");
		}

	}
}





	
