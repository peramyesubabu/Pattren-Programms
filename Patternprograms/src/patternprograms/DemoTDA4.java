package patternprograms;

import java.util.Scanner;

public class DemoTDA4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan=new Scanner(System.in);
		Float arr[][]=new Float[8][];
		arr[0]= new Float[2];
		arr[1]= new Float[2];
		arr[2]= new Float[7];
		arr[3]= new Float[3];
		arr[4]= new Float[4];
		arr[5]= new Float[5];
		arr[6]= new Float[3];
		arr[7]= new Float[2];
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter heights of every player"+ i +"player"+j);
				arr[i][j]=Scan.nextFloat();
			}
		}
		System.out.println("Array contents are--------->");
	
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		


	}

}
