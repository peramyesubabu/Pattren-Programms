package strings;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a string");
		String str1=scan.next();
		char arr1[]=str1.toCharArray();
		char arr2[]=new char[arr1.length];
		int j=arr2.length-1;
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr2[j]=arr1[i];
			j--;
		}
		System.out.println("Enterd String is"+ str1);
		str1=new String(arr2);
		System.out.println("revese string is"+ str1);
		
		

	}

}
