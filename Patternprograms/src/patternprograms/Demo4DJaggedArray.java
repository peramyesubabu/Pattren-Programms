package patternprograms;

import java.util.Scanner;

public class Demo4DJaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan=new Scanner(System.in);
				System.out.println("Enter 1D length to create four Dimension JAGGED array");
				
				//Creating 4D Array by taking length as input		
				int arr[][][][]=new int[Scan.nextInt()][][][];
				
				//taking 2D length and creating array
				for(int i=0;i<=arr.length-1;i++)
				{
					System.out.println("Enter 2D length for 1st D "+i);
					arr[i]=new int[Scan.nextInt()][][];
				}
				
				//for each 1st and 2nd D taking 3D length and creating array
				for(int i=0;i<=arr.length-1;i++)
				{
					for(int j=0;j<=arr[i].length-1;j++)
					{
						System.out.println("enter the 3D length for 1D "+i+" 2D "+j);
						arr[i][j]=new int[Scan.nextInt()][];
					}
				}
				//for each 1st D and 2nd D and 3rd D taking 4D length and creating array
				for(int i=0;i<=arr.length-1;i++)
				{
					for(int j=0;j<=arr[i].length-1;j++)
					{
						for(int k=0;k<=arr[i][j].length-1;k++)
						{
							System.out.println("Enter 4D length for 1D"+i+" 2D "+j+" 3D"+k);
							arr[i][j][k]=new int[Scan.nextInt()];
						}
					}
				}
				//Taking Array Elements as Input From Keyboard And Storing in array
				for(int i=0;i<=arr.length-1;i++)
				{
					for(int j=0;j<=arr[i].length-1;j++)
					{
						for(int k=0;k<=arr[i][j].length-1;k++)
						{
							for(int l=0;l<=arr[i][j][k].length-1;l++)
							{
							
						System.out.println("enter the value to store in array at index arr["+i+"]["+j+"]["+k+"]["+l+"]");
							arr[i][j][k][l]=Scan.nextInt();
						}
					}
				}
				}
				
				
				
				//Displaying Array Content....
				
				System.out.println("Array Contents Are...");
				for(int i=0;i<=arr.length-1;i++)
				{
					for(int j=0;j<=arr[i].length-1;j++)
					{
						for(int k=0;k<=arr[i][j].length-1;k++)
						{
							for(int l=0;l<=arr[i][j][k].length-1;l++)
							{
							System.out.print(arr[i][j][k][l]+" ");
						}
						System.out.println();
					}
					System.out.println();
				}
					System.out.println();
			}
		}
}
 
