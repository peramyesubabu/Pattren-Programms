package strings;

public class Char_Char_reverseconverson_of_data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr1[]= {'a','b','c','d','e','f','g','h'};
		char arr2[]=new char[arr1.length];
		int j=arr2.length-1;
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr2[j]=arr1[i];
			j--;
		}
		System.out.println("Array-1 contents are:"); 
		for(char c:arr1)
		{
			System.out.print(c+" ");
		}
		System.out.println( );
		System.out.println("==========================");
		System.out.println("Array-2 contents are");
		for(char c1:arr2)
		{
			System.out.print(c1+" ");
		}

	}

}


	
