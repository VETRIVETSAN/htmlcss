class pattern 
{
	public static  void main(String[]args)throws Exception
	{
	int n=10;
	for (int i=0;i<n;i++)
	{
		for (int j=0;j<n;j++)
		{
			Thread.sleep(100);
			if (i==j||i+j==n-1)
			{
				System.out.print("* ");
			}
			else 
			{
				System.out.print("  ");
			}
		
			
		}
		System.out.println();
	}

	}
}