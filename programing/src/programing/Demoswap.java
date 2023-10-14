package programing;

import java.util.Scanner;

public class Demoswap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan=new Scanner(System.in);
		int arr[]= {10,20,30,40,50};
		for(int i=0;i<=arr.length-1;i++)
		{
			if(i%2==0)
			{
				System.out.print(arr[i]+" ");
			}
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			if(i%2!=0)
			{
				System.out.print(arr[i]+" ");
			}
			
		}

	}

}
