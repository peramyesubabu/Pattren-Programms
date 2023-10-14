package patternprograms;

import java.util.Scanner;

public class FGTN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter any two numers");
		int num1=Scan.nextInt();
		int num2=Scan.nextInt();
		if(num1>num2)
		{
			System.out.println("num1:"+num1+" is greater");
			
		}
		else
		{
			System.out.println("num2:"+num2+" is greater");
		}

	}

}
