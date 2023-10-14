package strings;

import java.util.Scanner;
import java.lang.String;

public class Reverse_each_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Taking string from keyboard");
	
		String str1=scan.nextLine();
		String arr1[]=str1.split(" ");
		//String arr2[]=new String[arr1.length];
		String revcentence=" ";
		
		for(int i=0;i<=arr1.length-1;i++)
		{
			
			String word=arr1[i];
			String revword=" ";
			for(int j=word.length()-1;j>=0;j--)
			{
				revword=revword+word.charAt(j);
			}
			revcentence=revcentence+revword+" ";
				
			}
		System.out.println(" original string is :"+str1);
		System.out.println(" reversed string is:"+revcentence);
		}
			
		}
	
	 
					
			
