package methods;

import java.util.Scanner;

public class Searchapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		Search2 src=new Search2();
		src.linear_searching(arr,key);
		System.out.println("=====================");
		int ref=src.linear_searching();
		if(ref>=0)
		{
			System.out.println("key found at array index"+ref);
		}
		else
		{
			System.out.println("key not found"); 
		}
		
		
		
			//System.out.println("key not found");
		}
		
		
	}
//Scanner scan=new Scanner(System.in);
//System.out.println("enter array length");
//int arr[]=new int [scan.nextInt()];
//System.out.println("eneter array elements in to the array");
//for(int i=0;i<=arr.length-1;i++)
//{
//	System.out.println("eneter array element"+i);
//	arr[i]=scan.nextInt();
//	
//}
//System.out.println("eneter key to search");
//int key=scan.nextInt();
//Serach3 src=new Serach3();
//int ref=src.linear_searching(arr,key);
		



		