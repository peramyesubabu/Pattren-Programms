package strings;

import java.util.Scanner;

public class String_spliting {

	public static void main(String[] args) {
		
//Scanner scan=new Scanner(System.in);
System.out.println("Enter string");
		String str="kodnest Technologies";
		String arr[]=str.split("t");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("====================");
		for(String s:arr)
		{
			System.out.println(s);
		}

	}

}
