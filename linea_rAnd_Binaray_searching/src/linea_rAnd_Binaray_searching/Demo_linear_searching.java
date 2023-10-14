package linea_rAnd_Binaray_searching;

import java.util.Scanner; 

public class Demo_linear_searching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter length of the array");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array elenemts:------------");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter element of an array"+i);
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter key to seach");
		int key=scan.nextInt();
		for(int i=0;i<=arr.length-1;i++)
		{
			if(key==arr[i])
			{
				System.out.println("key found at the array index of"+i);
				System.exit(0);
			}
		}
		System.out.println("key not found");

	}

}
