package patternprograms;

import java.util.Scanner;

public class Rotating_Array {

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
		System.out.println("Array contens before shorting");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Eenter an element  to  rotate");
		int k=Scan.nextInt();
		
		int temp[]=new int[k];
		for(int i=0;i<k;i++)
		{
			temp[i]=arr[i];
		}
			int j=0;//j=arr.length-1;
			for(int i=k;i<=arr.length-1;i++)
			{
				arr[j]=arr[i];
				j++;//j--
				
			}
			int x=0;
			for(int i=arr.length-k;i<=arr.length-1;i++)
			{
				arr[i]=temp[x];
				x++;
			}
		
	System.out.println();
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.print(arr[i]+" ");
	}
}
}
			
			
			
		
		


