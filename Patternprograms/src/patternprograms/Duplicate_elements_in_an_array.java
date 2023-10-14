package patternprograms;

import java.util.Scanner;

public class Duplicate_elements_in_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array length");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements of an array");
		for(int i=0;i<=arr.length-1;i++)

		{
			System.out.println("Enter element of an array"+i);
			arr[i]=scan.nextInt();
		}
		System.out.println();
		System.out.println("Array contents are------------");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("--------------------------------");
		System.out.println("Duplicate elements in array are------");
		int count;
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]==arr[j])
				{
					 
					System.out.println(arr[i]);
					 
					 }
				}
			

			
		}
		

		
	}

}
