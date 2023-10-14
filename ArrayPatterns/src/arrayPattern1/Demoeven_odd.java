package arrayPattern1;

import java.util.Scanner;

public class Demoeven_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan=new Scanner(System.in);
		int even=0;
		int odd=0;
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
			if(a[i]%2==0)
			{
			even+=a[i];
	
			}
			else
			{
				
				odd+=a[i];
		}
			

	}
		System.out.println("sum of even numbers in array:"+even);
		System.out.println("sum of even numbers in array:"+odd);



}
}
