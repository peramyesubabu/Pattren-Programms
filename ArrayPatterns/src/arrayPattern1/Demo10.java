package arrayPattern1;

import java.util.Scanner;

public class Demo10 {

	private static final int Sum = 0;

	public static void main(String[]args) {
		// TODO Auto-generated method stub
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter array length ");
		int a[]=new int[Scan.nextInt()];
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			System.out.println("enter array elements are"+i);
			a[i]=Scan.nextInt();
		}
		System.out.println("array contents atre");
		for(int i=0;i<=a.length-1;i++)
		{
			sum+=a[i];
			
			System.out.print("value ofsum"+sum+" ");
			System.out.println();
		}
			System.out.println("Total sum"sum" ");



	}

}
