
class Pattern3 
{

	public static void main(String[] args) 
	{
		int n=1;
		int k=5;
		char ch='A';
		for (int i=0;i<k ;i++ )
		{
			for (int j=0;j<k ;j++ )
			{
				if (i%2==0)
				{
					System.out.print(n++ +" ");
				}
				else
				{
					System.out.print(ch++ +" ");

				}

				}
			System.out.println();
			ch='A';
		}
	}
}
