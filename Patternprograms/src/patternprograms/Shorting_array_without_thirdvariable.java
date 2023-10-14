package patternprograms;

import java.util.Scanner;

public class Shorting_array_without_thirdvariable {

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
		System.out.println("arrange array in assending order");
		int a=arr[0];
		int b=arr[1];
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
		{
			
			if(arr[i]>arr[j])
			{
				a=a+b;
				b=a-b;
				a=a-b;
			}
				
			}
			System.out.println(arr[i]);

		

	}
	}
}


