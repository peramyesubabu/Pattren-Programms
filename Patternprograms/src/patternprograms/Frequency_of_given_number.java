package patternprograms;

import java.util.Scanner;

public class Frequency_of_given_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		//create one array
		System.out.println("enter array length");
		int n=scan.nextInt();
		int arr[]=new int [n];
		System.out.println("enter array elements in to the array");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter element is strored in an array"+i);
			arr[i]=scan.nextInt();
		}
		//printing array elements before sorting
		System.out.println("==========================");
		System.out.println("Array contents before shorting");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("=========================");
		//sort an array
		System.out.println("Array conents after shorting");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]>arr[j])
				{
					int help=arr[i];
					arr[i]=arr[j];
					arr[j]=help;
				}
			}
			
		}
		//printing array elements after sorting
		System.out.println("Enter array contents after sorting");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");

	}
		//take the integer input from user
		System.out.println("Enter a input value ");
		int input=scan.nextInt();
		//creation of helper variable
		int count=0;
		//loop
		for(int i=0;i<=arr.length-1;i++)
		{
			if(input==arr[i])
			{
				count++;
			}
		}
		System.out.print("frequencey of "+input+"is:"+count);

		
		}
		

}



