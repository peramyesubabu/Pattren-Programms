package methods;

public class FindGCD {
	int findingGcd(int m,int n)
	{
		while(n!=0)
		{
			int ref=m%n;
			m=n;
			n=ref;
			
		}
		return m;
	}

}
