package methods;

import java.util.Scanner;

public class Claculator 
{
	Scanner scan=new Scanner(System.in);
	void add()
	{
		System.out.println("Enter two numbers for adding");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=a+b;
		System.out.println("Addition of two numbers ");
		System.out.println(c);
	}
	void sub(int x,int y)
	{
		System.out.println("subtraction of two numbers");
		// x=scan.nextInt();
		 //y=scan.nextInt();
		int z=x-y;
		System.out.println(z); 
	}
	int mul()
	{
		System.out.println("enter two numbers for multiplication");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=a*b;
		return c;
	}
	int div(int x,int y)
	{
		int z=x/y;
		//System.out.println(z);
		return z;
		
	}

}
