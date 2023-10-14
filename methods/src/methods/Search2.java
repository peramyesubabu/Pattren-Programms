package methods;

import java.util.Scanner;

public class Search2 {
	void linear_searching( int arr[],int key)
	
	{
	for(int i=0;i<=arr.length-1;i++)
	{
		if(key==arr[i])
		{
			System.out.println("key found at array index"+i);
			return;
			
		}
	}
	System.out.println("key not found");

}
	
	int linear_searching()
	
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter array length");
		int arr[]=new int [scan.nextInt()];
		System.out.println("eneter array elements in to the array");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("eneter array element"+i);
			arr[i]=scan.nextInt();
			
		}
		System.out.println("eneter key to search");
		int key=scan.nextInt();
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]==key)
				
			{
				//System.out.println("key found at array index"+i);
				return i; 
			}
			
				//System.out.println("key not found"); 
		}
		return -1;
		
	}
}
