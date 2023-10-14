package debugging;

public class Debugging
{
	int Debugging_reversenumber(int num)
	{
		int digit;
		int rev=0;
		while(num!=0)
		{
			digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		return rev;
		
	}

}
