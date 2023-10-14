package patternprograms;

import java.util.Scanner;

public class TDArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter the length of 2nd matrix");
		int mat1[][]=new int[Scan.nextInt()][Scan.nextInt()];
		for(int i=0;i<=mat1.length-1;i++)
		{
			for(int j=0;j<=mat1[i].length-1;j++)
			{
				System.out.println(" Enter element to stored in matrix index "+i+" "+j);
				mat1[i][j]=Scan.nextInt();
			}
		}
		System.out.println("values of mat-1");
		System.out.println("==========================");
		for(int i=0;i<=mat1.length-1;i++)
		{
			for(int j=0;j<=mat1[i].length-1;j++)
			{
				System.out.print(mat1[i][j]+" ");
			}
		System.out.println();

	}
		System.out.println("=========================");
		System.out.println("Enter the length of 2nd matrix");
		int mat2[][]=new int[Scan.nextInt()][Scan.nextInt()];
		for(int i=0;i<=mat2.length-1;i++)
		{
			for(int j=0;j<=mat2[i].length-1;j++)
			{
				System.out.println(" Enter element to stored in matrix index "+i+" "+j);
				mat2[i][j]=Scan.nextInt();
			}
		}
		System.out.println("values of mat-2");
		System.out.println("==========================");
		for(int i=0;i<=mat2.length-1;i++)
		{
			for(int j=0;j<=mat2[i].length-1;j++)
			{
				System.out.print(mat2[i][j]+" ");
			}
			System.out.println();
	}
		System.out.println("Addition of two matrix");
		int mat3[][]=new int[mat1.length][mat2.length];
		for(int i=0;i<=mat3.length-1;i++)
		{
			for(int j=0;j<=mat3.length-1;j++)
			{
			mat3[i][j]=mat1[i][j]+ mat2[i][j];
		}
}
		System.out.println();
		System.out.println("mat-3 output result");
		for(int i=0;i<=mat3.length-1;i++)
		{
			for(int j=0;j<=mat3.length-1;j++)
			{
			System.out.print(mat3[i][j]+" ");
		}
			System.out.println();
		
}
		System.out.println("Addition of two matrix");
		int mat6[][]=new int[mat1.length][mat2.length];
		for(int i=0;i<=mat6.length-1;i++)
		{
			for(int j=0;j<=mat6.length-1;j++)
			{
			mat6[i][j]=mat1[i][j]+ mat2[i][j];
		}
}
		System.out.println();
		int sum1=0;
		int sum2=0;
		for(int i=0;i<=mat6.length-1;i++)
		{
			for(int j=0;j<=mat6.length-1;j++)
			{
				if(i==j)
				{
					sum1+=mat6[i][j];
					
				}
				if(i+j==2)
				{
					sum2=sum2+mat6[i][j];
					
				}
			}
			System.out.println();
		}
				System.out.println(sum1);
				System.out.println(sum2);
				System.out.println("===============================");
		System.out.println("subtraction of two matrix");
		int mat4[][]=new int[mat1.length][mat2.length];
		for(int i=0;i<=mat4.length-1;i++)
		{
			for(int j=0;j<=mat4.length-1;j++)
			{
			mat4[i][j]=mat1[i][j]- mat2[i][j];
		}
}
		System.out.println();
		for(int i=0;i<=mat4.length-1;i++)
		{
			for(int j=0;j<=mat4.length-1;j++)
			{
			System.out.print(mat4[i][j]+" ");
		}
			System.out.println();
		
}
		//Division of two matrix and result stored in another matrix
		System.out.println("divison of two matrix");
		int mat5[][]=new int[mat1.length][mat2.length];
		for(int i=0;i<=mat5.length-1;i++)
		{
			for(int j=0;j<=mat5.length-1;j++)
			{
				mat5[i][j]=mat1[i][j]/ mat2[i][j];
		}
}
		//print
		System.out.println();
		for(int i=0;i<=mat5.length-1;i++)
		{
			for(int j=0;j<=mat5.length-1;j++)
			{
			System.out.print(mat5[i][j]+" ");
		}
			System.out.println();
		
}
//multiplication of two  matrix and result stored in another matrices
				System.out.println("multiplication of two matrix");
				int mat7[][]=new int[mat1.length][mat2.length];
				for(int i=0;i<=mat7.length-1;i++)
				{
					for(int j=0;j<=mat7.length-1;j++)
					{
						for(int k=0;k<=mat7.length-1;k++)
						{
							mat7[i][j]=mat7[i][j]+mat1[i][k]*mat2[k][j];
						}
							
					
				}
		}
				//print
				System.out.println();
				for(int i=0;i<=mat7.length-1;i++)
				{
					for(int j=0;j<=mat7.length-1;j++)
					{
					System.out.print(mat7[i][j]+" ");
				}
					System.out.println();
				
				
				
		}
}
}




		
	


