package programing;
import java.util.Scanner;
import java.lang.String;
public class paliDrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Taking string from keybord");
		String str1=scan.nextLine();
		char arr1[]=str1.toCharArray();
		char arr2[]=new char[arr1.length];
		int j=arr2.length-1;
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr2[j]=arr1[i];
			j--;
		}
		System.out.println("entered string is:"+str1);
		String str2=new String(arr2);
		System.out.println("Reverse string is:"+str2);
		if(str1.equals(str2))
		{
			System.out.println("Entered string is palindrom");
		}
		else
		{
			System.out.println("Entered string is  not palindrom");
			
		}

	}

}
