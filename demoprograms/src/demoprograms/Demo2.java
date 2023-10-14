package demoprograms;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) 
	{
		Scanner Scan=new Scanner(System.in);
	
				int a=Scan.nextInt();
				int b=Scan.nextInt();
				System.out.println("values of a and b are a="+a+" b="+b+"");
				int help;
				help=a;
				b=help;
				System.out.println("Values of a and b are a="+b+" b="+help+"");

	}

}
