package debugging;

import java.util.Scanner;

public class Debugging_by_using_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scan.nextInt();
		Debugging D=new Debugging();
		int rev1=D.Debugging_reversenumber(num);
		System.out.println("Reverse number");
		System.out.println(rev1); 

	}

}
