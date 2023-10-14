package arrayPattern1;

import java.util.Scanner;

public class Demo_product_of_all_elements_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter array length ");
		int a[]=new int[Scan.nextInt()];
		int product=1;
		for(int i=0;i<a.length;i++)
		{
			System.out.println("enter array elements are"+i);
			a[i]=Scan.nextInt();
		}
		System.out.println("array contents atre");
		for(int i=0;i<=a.length-1;i++)
		{
			product=product*a[i];
			//product*=a[i];
			
			System.out.print("value ofsum"+i+ product+" ");
			System.out.println();
		}
			System.out.println("Total sum"+product);



	}

}
