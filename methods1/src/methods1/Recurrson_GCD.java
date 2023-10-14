package methods1;

public class Recurrson_GCD {
	int Greatestcommondisior(int m,int n)
	{
		if(n==0)
		{
			return 1;
		}
		else
		{
			return (n,m%n);
		}
	}

}
