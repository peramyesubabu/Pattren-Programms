package strings;
import java.util.Scanner;
import java.lang.String;
public class Reverse 
{
	public static void main(String[]arg)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Taking string from key board");
		String str1=scan.nextLine();
		char[] arr1=str1.toCharArray();
		char[] arr2=new char[arr1.length];
		//coping the space from arr1 to arr2
		for(int i=0;i<=arr1.length-1;i++)
		{
			if(arr1[i]==' ')
			{
				arr2[i]=arr1[i];
				
			}
		
			
		}
		//coping contents from arr1 to arr2 in reverse direction
		int j=arr2.length-1;
		for(int i=0;i<=arr1.length-1;i++)
		{
			if(arr1[i]!=' ')
			{
				if(arr2[j]==' ')
				{
					
					j--;
				}
				arr2[j]=arr1[i];
				j--;
			}
		}
		System.out.println(" Original string: "+str1);
		String str2=new String(arr2);
		System.out.println(" Reverse string: "+str2+" ");
		

	}

}
