package arrayPattern1;

import java.util.Scanner;

public class Demo_reversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter array length ");
		int a[]=new int[Scan.nextInt()];
		System.out.println("enter array elements are");
		for(int i=0;i<a.length;i++)
		{
			
			a[i]=Scan.nextInt();
		}
		System.out.println("array contents are");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]+" ");
		}
	}

}
