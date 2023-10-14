package patternprograms;

public class Transposew_of_array_with90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int arr1[][]= new int[3][3];
		
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr.length-1;j++)
			{
				arr1[j][2-i]=arr[i][j];//arr1[j][arr1.length-1-i]=arr1[i][j];
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


	
