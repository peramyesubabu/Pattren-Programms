package demoprograms;

import java.util.Scanner;

public class Demosearching {

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
		System.out.println("Enter key to search");
	int key=Scan.nextInt();
	int low=0;
	int high=arr.length-1;
	int mid;
	while(key<=arr.length-1)
	{
		mid=(low+high)/2;
		if(key==arr[mid])
		{
			System.out.println("key found at the index"+mid);
			System.exit(0);
		}
	}
	
		

		

	}

}
