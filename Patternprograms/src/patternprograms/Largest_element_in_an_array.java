package patternprograms;

import java.util.Scanner;

public class Largest_element_in_an_array {

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
		System.out.println("largest element in an array is:");
		int largest=arr[0];
		for(int i=0;i<=arr.length-1;i++)
		{
			
			if(largest<arr[i])
			{
				largest=arr[i];
			}
		}
			
			System.out.print(largest);
		

	}

}


	