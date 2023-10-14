package patternprograms;

import java.util.Scanner;

public class finding_largest_element_on_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter array length");
		
		int n=Scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<=n-1;i++)
		{
			System.out.println("Enter element of an array "+i);
			arr[i]=Scan.nextInt();
			
		}
		System.out.println("==============================");
		System.out.println(" array contents before shorting");
		for(int i=0;i<=n-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("==============================");
		System.out.println("array contents after shorting");
		for(int i=0;i<=n-1;i++)
		{
			for(int j=i+1;j<=n-1;j++)
			{
				if(arr[i]>arr[j])
				{
					int help=arr[i];
					arr[i]=arr[j];
					arr[j]=help;
				
				}
			}
			System.out.print(arr[i]+" ");
		}
		System.out.println("largest element of an array" );
		int largest=arr[0];
		for(int i=0;i<=arr.length-1;i++)
		{
			if(largest<arr[i])
			{
				largest=arr[i];
			}
			}
		System.out.println(largest);
		System.out.println(arr[n-2]);
		
		}
	

}

