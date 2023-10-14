package arrayPattern1;

import java.util.Scanner;

public class Demo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter array length ");
		int a[]=new int[Scan.nextInt()];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("enter array elements are"+i);
			a[i]=Scan.nextInt();
		}
		System.out.println("array contents atre");
		for(int i=0;i<=a.length-1;i++)
		{
			if(i%3==0||i%5==0)
			{
			System.out.print(i+" ");
		}
			System.out.println();



	}

}
}
