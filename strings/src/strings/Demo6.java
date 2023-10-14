package strings;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a string");
		String str1=scan.next();
		char arr1[]=str1.toCharArray();
		for(int i=0;i<=arr1.length-1;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		System.out.println("===================");
		char arr2[]=new char[arr1.length];
		for(int i=0;i<=arr1.length-1;i++)
		{
			for(int j=arr2.length-1;j>=arr1.length-1;j--)
			{
				 arr2[j]=arr1[i];
			}
		}
		System.out.println(" original string "+str1);
		String str2=new String(arr2);
		System.out.println(" reverse string "+str1);
		
	}
}
		
		
	


