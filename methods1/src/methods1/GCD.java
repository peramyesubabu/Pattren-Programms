package methods1;

public class GCD {
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


