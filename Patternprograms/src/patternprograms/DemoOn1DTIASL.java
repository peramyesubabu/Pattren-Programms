//taking an input as a length and creating 1D array 
package patternprograms;
import java.util.Scanner;
public class DemoOn1DTIASL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan=new Scanner(System.in);
		System.out.println("Taking an input as a array length and creating 1D integer array");
		int arr[]=new int[Scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter an element to store in array index"+i);
			arr[i]=Scan.nextInt();
		}
		System.out.println(" Array contents are.....> ");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();

	}

}
