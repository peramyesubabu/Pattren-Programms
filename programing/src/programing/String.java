package programing;

import java.util.Scanner;
public class String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Taking string from keybord");
		java.lang.String Str1=scan.nextLine();
		char arr1[]=Str1.toCharArray();
		char arr2[]=new char[arr1.length];
		int j=arr2.length-1;
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr2[j]=arr1[i];
			j--;
		}
		System.out.println("entered string is:"+Str1);
		String str2=new String();
		System.out.println("Reverse string is:"+str2);

	}

	private char[] tocharArray() {
		// TODO Auto-generated method stub
		return null;
	}

}


	
