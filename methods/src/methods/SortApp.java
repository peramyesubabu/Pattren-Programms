package methods;

import java.util.Scanner;

public class SortApp {

	public static void main(String[]args)
	{

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
		bs.BubbleSorting_metohd2(arr, n);

	}

}

