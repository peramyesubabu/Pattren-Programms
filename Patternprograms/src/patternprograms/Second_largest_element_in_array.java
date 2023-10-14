package patternprograms;

import java.util.Scanner;

public class Second_largest_element_in_array {

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


		System.out.println("second largest element in an array"+arr[3]);
}
}
