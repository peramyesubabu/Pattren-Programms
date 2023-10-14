package strings;

public class emo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="kodnest technologies pvt ltd";
		System.out.println(str);
		System.out.println("=================");
		String arr[]=str.split(" ");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println( );
		//we can use for each loop(enchanced for loop)for
		for(String s:arr)
		{
			System.out.println(s);
		}

	}

}
