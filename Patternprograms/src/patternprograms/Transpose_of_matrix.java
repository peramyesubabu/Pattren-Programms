package patternprograms;

public class Transpose_of_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,1,1},{2,2,2},{3,3,3}};
		int arr1[][]= new int[3][3];
		
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr.length-1;j++)
			{
				arr1[j][i]=arr[i][j];
			}

		}
		System.out.println();
		System.out.println("transpose of matrix");
		for(int i=0;i<=arr1.length-1;i++)
		{
			for(int j=0;j<=arr1.length-1;j++)
			{
				
		System.out.print(arr1[i][j]);


	}
			System.out.println();

}
	}
}
