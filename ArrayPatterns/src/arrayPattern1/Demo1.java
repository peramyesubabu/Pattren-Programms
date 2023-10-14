package arrayPattern1;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan=new Scanner(System.in);
		System.out.println("enter array length");
		int a[]=new int[Scan.nextInt()];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("enter array elements are"+i);
			a[i]=Scan.nextInt();
		}
		System.out.println("array contents atre");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
