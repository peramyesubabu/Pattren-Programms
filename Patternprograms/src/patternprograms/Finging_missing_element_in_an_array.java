package patternprograms;

import java.util.Scanner;

public class Finging_missing_element_in_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,4,5,6};
		int n=arr.length;
		
//		System.out.println();
		//int n =arr.length;
		int sum;
		sum =(n+1)*(n+2)/2;
		for(int i=0;i<=arr.length-1;i++)
		{
			sum=sum-arr[i];
			
		}
		System.out.println(sum);
		
		

	}

}
