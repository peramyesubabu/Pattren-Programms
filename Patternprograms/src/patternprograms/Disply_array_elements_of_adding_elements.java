package patternprograms;

public class Disply_array_elements_of_adding_elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={2,7,11,15};
		int target=9;
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]+arr[j]==target)
				{
					System.out.println(i+" "+j);
					break;
				}
			}
		}
		System.out.println();
		int arr1[]={2,7,11,15};
		int target1=35;
		for(int i=0;i<=arr1.length-1;i++)
		{
			for(int j=i+1;j<=arr1.length-1;j++)
			{
				if(arr1[i]+arr1[j]==target1)
				{
					System.out.println(i+" "+j);
					
				}
			}
		}

	}

}
