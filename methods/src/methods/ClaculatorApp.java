package methods;

import java.util.Scanner;

public class ClaculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		Claculator calsi=new Claculator();
		System.out.println("Enter two numers");
		int x=scan.nextInt();
		int y=scan.nextInt();

		calsi.add();
		calsi.sub(x,y);
		int res1=calsi.mul();
		System.out.println(" multiplicacation of two numbers: "+res1);
		int res2=calsi.div(x, y);
				System.out.println(" divison of two numbers: "+res2);
		
	}

}
