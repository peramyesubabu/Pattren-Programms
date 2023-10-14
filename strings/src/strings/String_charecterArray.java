package strings;

public class String_charecterArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Kodnest Technologies Pvt Ltd";
		char arr[]=str.toCharArray();
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("================");
		for(char c:arr)
		{
			System.out.println(c);
		}

	}

}
