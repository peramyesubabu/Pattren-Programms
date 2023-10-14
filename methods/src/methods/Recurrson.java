package methods;

public class Recurrson {
	int Greatestcommondisior(int m,int n)
	{
		if(n==0)
		{
			return m;
		}
		else
		{
			return Greatestcommondisior(n,m%n);
		}
	}

}



