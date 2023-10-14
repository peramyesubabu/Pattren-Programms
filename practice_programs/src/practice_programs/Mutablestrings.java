package practice_programs;

public class Mutablestrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//mutable string creation by using StrungBuffer
		StringBuffer s=new StringBuffer("Raka krishna");
		System.out.println(s.capacity());
		System.out.println("===========================");
		//mutable String creation by using StringBuilder
		StringBuilder s1=new StringBuilder("SivaKeshva");
		System.out.println(s1.capacity());
		StringBuffer s3=new StringBuffer();
		System.out.println(s3.capacity());
		System.out.println("=============");
		StringBuilder s4=new StringBuilder("i am confident on my self");
		System.out.println(s4.capacity());

	}

}
