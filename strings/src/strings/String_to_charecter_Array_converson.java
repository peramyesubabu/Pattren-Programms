package strings;
import java.util.Scanner;
public class String_to_charecter_Array_converson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string");
		String str1=scan.next();
		char arr1[]=str1.toCharArray();
		for(int i=0;i<=arr1.length-1;i++)
		{
			System.out.println(arr1[i]);
		}
		System.out.println("original string"+str1);
		String str2=new String(arr1);
		System.out.println("Reverse string"+str1);


	}
}
