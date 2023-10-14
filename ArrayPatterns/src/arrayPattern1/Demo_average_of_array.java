package arrayPattern1;

import java.util.Scanner;

public class Demo_average_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter array length ");
		int a[]=new int[Scan.nextInt()];
		int sum=0;
		System.out.println("enter array elements are");
		for(int i=0;i<a.length;i++)
		{
			
			
			a[i]=Scan.nextInt();
		}
		System.out.println("array contents are");
		for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum/a.length-1);
			
		}
}


			



