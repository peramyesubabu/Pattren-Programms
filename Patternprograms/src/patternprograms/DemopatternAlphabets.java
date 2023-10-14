package patternprograms;

public class DemopatternAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//printing of 'A' letter
		for(int i=1;i<=11;i++)
			{
			for(int j=1;j<=11;j++)
			{
			if(i==1&&j!=1&&j!=11||i==6||j==1&&i!=1&&i!=11||j==11&&i!=1&&i!=11) 
			{
			System.out.print("*");
			}
			else
			{
			System.out.print(" ");
			}
			}
			System.out.println();
			}
		//printing of 'B' letter
		System.out.println();
		for(int i=1;i<=11;i++)
		{
		for(int j=1;j<=11;j++)
		{
		if(i==1&&j!=11||i==6&&j!=11||j==1||j==11&&i!=1&&i!=6&&i!=11||i==11&&j!=11) 
		{
		System.out.print("*");
		}
		else
		{
		System.out.print(" ");
		}
		}
		System.out.println();
		}
		//printing of 'C' letter
		System.out.println();
		for(int i1=1;i1<=11;i1++)
		{
		for(int j=1;j<=11;j++)
		{
		if(i1==1&&j!=1||j==1&&i1!=1&&i1!=11||i1==11&&j!=1) 
		{
		System.out.print("*");
		}
		else
		{
		System.out.print(" ");
		}
		}

		System.out.println();
			}
		//printing of 'D' letter
		System.out.println();
		for(int i1=1;i1<=11;i1++)
		{
		for(int j=1;j<=11;j++)
		{
		if(i1==1&&j!=11||j==1||i1==11&&j!=11||j==11&&i1!=1&&i1!=11) 
		{
		System.out.print("*");
		}
		else
		{
		System.out.print(" ");
		}
		}
		System.out.println();
		}
		//printing of 'E' letter
		System.out.println();
		for(int i1=1;i1<=11;i1++)
		{
		for(int j=1;j<=11;j++)
		{
		
		if(i1==1&&j!=1||i1==11&&j!=1||i1==6||j==1&&i1!=1&&i1!=6&&i1!=11) 
		{
		System.out.print("*");
		}
		else
		{
		System.out.print(" ");
		}
		}
		System.out.println();
		}
		//printing of 'F' letter
		System.out.println();
		for(int i2=1;i2<=11;i2++)
		{
		for(int j=1;j<=11;j++)
		{
		
		if(i2==1&&j!=1||i2==6||j==1&&i2!=1) 
		{
		System.out.print("*");
		}
		else
		{
		System.out.print(" ");
		}
		}
		System.out.println();
		
		}
		//printing of 'G' letter
		System.out.println();
		for(int i2=1;i2<=11;i2++)
		{
		for(int j=1;j<=11;j++)
		{
		
		if(i2==1&&j!=1||i2==6&&j!=2&&j!=3&&j!=4&&j!=5||j==1&&i2!=1||i2==11&&j!=7&&j!=8&&j!=9&&j!=10||j==11&&i2!=2&&i2!=3&&i2!=4&&i2!=5||j==6&&i2!=2&&i2!=3&&i2!=4&&i2!=5) 
		{
		System.out.print("*");
		}
		else
		{
		System.out.print(" ");
		}
		}
		System.out.println();
		}
		//printing of 'H' letter
		System.out.println();
		for(int i1=1;i1<=11;i1++)
		{
		for(int j=1;j<=11;j++)
		{
		
		if(i1==6||j==1||j==11) 
		{
		System.out.print("*");
		}
		else
		{
		System.out.print(" ");
		}
		}

		System.out.println();
		
		}
		//printing of 'I' letter
		System.out.println();
		for(int i1=1;i1<=11;i1++)
		{
		for(int j=1;j<=11;j++)
		{
		
		if(j==6||i1==1||i1==11) 
		{
		System.out.print("*");
		}
		else
		{
		System.out.print(" ");
		}
		}
		System.out.println();
		}
		//printing of 'J' letter
		System.out.println();
		for(int i=1;i<=11;i++)
		{
		for(int j=1;j<=11;j++)
		{
		
		if(i==1||i==11&&j!=7&&j!=8&&j!=9&&j!=10&&j!=11||j==6||j==1&&i!=2&&i!=3&&i!=4&&i!=5) 
		{
		System.out.print("*");
		}
		else
		{
		System.out.print(" ");
		}
		}
		System.out.println();
	}
		//printing of 'K' letter
		System.out.println();

		for(int i1=1;i1<=11;i1++)
		{
		for(int j=1;j<=11;j++)
		{
		
		if(j==1||i1+j==7||i1-j==5) 
		{
		System.out.print("*");
		}
		else
		{
		System.out.print(" ");
		}
		}
		System.out.println();
		
	}
		//printing of 'L' letter
		System.out.println();
		for(int i1=1;i1<=11;i1++)
		{
		for(int j=1;j<=11;j++)
		{
		
		if(j==1||i1==11) 
		{
		System.out.print("*");
		}
		else
		{
		System.out.print(" ");
		}
		}
		System.out.println();
	}
		//printing of 'M' letter
		System.out.println();
		for(int i1=1;i1<=11;i1++)
		{
		for(int j=1;j<=11;j++)
		{
		
		if(j==1&&i1!=1||j==11&&i1!=1||i1==j&&j!=7&&j!=8&&j!=9&&j!=10&&j!=6&&i1!=1||j+i1==12&&j!=2&&j!=6&&j!=5&&j!=4&&j!=3&&i1!=1) 
		{
		System.out.print("*");
		}
		else
		{
		System.out.print(" ");
		}
		}
		System.out.println();
	}
		//printing of 'N' letter
		System.out.println();
		for(int i1=1;i1<=11;i1++)
		{
		for(int j=1;j<=11;j++)
		{
		
		if(j==1&&i1!=1||j==11&&i1!=11||i1==j&&i1!=1&&i1!=11) 
		{
		System.out.print("*");
		}
		else
		{
		System.out.print(" ");
		}
		}
		System.out.println();
		}
		//printing of 'O' letter
		System.out.println();
		for(int i1=1;i1<=11;i1++)
		{
		for(int j=1;j<=11;j++)
		{
		
		if(j==1&&i1!=1&&i1!=11||i1==11&&j!=1&&j!=11||i1==1&&j!=11&&j!=1||j==11&&i1!=11&&i1!=1&&i1!=6) 
		{
		System.out.print("*");
		}
		else
		{
		System.out.print(" ");
		}
		}
		System.out.println();
		}
		//printing of 'P' letter
		System.out.println();
		for(int i=1;i<=11;i++)
		{
		for(int j=1;j<=11;j++)
		{
		if(i==1&&j!=1&&j!=11||i==6||j==1&&i!=1&&i!=11||j==11&&i!=1&&i!=11&&i!=7&&i!=8&&i!=9&&i!=10&&i!=11) 
		{
		System.out.print("*");
		}
		else
		{
		System.out.print(" ");
		}
		}
		System.out.println();
	}
		//printing of 'Q' letter
		System.out.println();
		for(int i=1;i<=11;i++)
		{
		for(int j=1;j<=11;j++)
		{
		if(i==1&&j!=1&&j!=1||i==11&&j!=1&&j!=11||j==1&&i!=1&&i!=11||j==11&&i!=1&&i!=6||i==6&&j!=11) 
		{
		System.out.print("*");
		}
		else
		{
		System.out.print(" ");
		}
		}
		System.out.println();

	}
		//printing of 'R' letter
		System.out.println();
		for(int i=1;i<=11;i++)
		{
		for(int j=1;j<=11;j++)
		{
		if(i==1&&j!=1&&j!=1||j==1&&i!=1||j==11&&i!=1&&i!=6||i==6&&j!=11) 
		{
		System.out.print("*");
		}
		else
		{
		System.out.print(" ");
		}
		}
		System.out.println();
	}
		//printing of 'S' letter
		System.out.println();
		for(int i=1;i<=11;i++)
		{
		for(int j=1;j<=11;j++)
		{
		if(i==1&&j!=11&&j!=1||i==6&&j!=11&&j!=1||j==1&&i!=7&&i!=8&&i!=9&&i!=10&&i!=6&&i!=1||j==11&&i!=1&&i!=6&&i!=2&&i!=3&&i!=4&&i!=5&&i!=11||i==11&&j!=11) 
		{
		System.out.print("*");
		}
		else
		{
		System.out.print(" ");
		}
		}
		System.out.println();
	}
		//printing of 'T' letter
		System.out.println();
		for(int i=1;i<=11;i++)
		{
		for(int j=1;j<=11;j++)
		{
		if(i==1||j==6&&i!=11&&i!=10&&i!=9 ) 
		{
		System.out.print("*");
		}
		else
		{
		System.out.print(" ");
		}
		}
		System.out.println();
	}
		//printing of 'U' letter
		System.out.println();
		for(int i=1;i<=11;i++)
		{
		for(int j=1;j<=11;j++)
		{
		if(i==11&&j!=1||j==1&&i!=11&&i!=1&&i!=2&&i!=3||j==11&&i!=11&&i!=1&&i!=2&&i!=3) 
		{
		System.out.print("*");
		}
		else
		{
		System.out.print(" ");
		}
		}
		System.out.println();
	}
		//printing of 'V' letter
		System.out.println();
		for(int i=1;i<=11;i++)
		{
		for(int j=1;j<=11;j++)
		{
		if(i==j&&j!=7&&j!=8&&j!=9&&j!=10&&j!=11||i+j==12&&j!=6&&j!=5&&j!=4&&j!=3&&j!=2&&j!=1) 
		{
		System.out.print("*");
		}
		else
		{
		System.out.print(" ");
		}
		}
		System.out.println();
	}
		//printing of 'W' letter
		System.out.println();
		for(int i=1;i<=11;i++)
		{
		for(int j=1;j<=11;j++)
		{
		if(j==1||j==11||i==j&&j!=1&&j!=2&&j!=3&&j!=4&&j!=5&&j!=11||j+i==12&&j!=11&&j!=10&&j!=9&&j!=8&&j!=7&&j!=6&&j!=1) 
		{
		System.out.print("*");
		}
		else
		{
		System.out.print(" ");
		}
		}
		System.out.println();
		}
		//printing of 'X' letter
		System.out.println();
		for(int i=1;i<=11;i++)
		{
		for(int j=1;j<=11;j++)
		{
		if(i==j||i+j==12) 
		{
		System.out.print("*");
		}
		else
		{
		System.out.print(" ");
		}
		}
		System.out.println();
	}
		//printing of 'Y' letter
		System.out.println();
		for(int i=1;i<=11;i++)
		{
		for(int j=1;j<=11;j++)
		{
		if(i==j&&j!=6&&j!=7&&j!=8&&j!=9&&j!=10&&j!=11||i+j==12) 
		{
		System.out.print("*");
		}
		else
		{
		System.out.print(" ");
		}
		}
		System.out.println();
	}
		//printing of 'Z' letter
		System.out.println();
		for(int i=1;i<=11;i++)
		{
		for(int j=1;j<=11;j++)
		{
		if(i==1&&j!=11||i==11&&j!=1||i+j==12&&j!=11&&j!=1) 
		{
		System.out.print("*");
		}
		else
		{
		System.out.print(" ");
		}
		}
		System.out.println();
	}
		System.out.println();
	}
	
}

