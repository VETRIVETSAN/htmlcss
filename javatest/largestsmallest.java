class largestsmallest
{
	public static void main(String[] args) 
	{
		int largest=largestoftwo(10,18);
		int smallest=smallestoftwo(10,18);

		System.out.println("largest of two numbers:"+largest);
		System.out.println("smallset of two numbers:"+smallest);
	}
	public static int largestoftwo(int a,int b)
	{
		if (a>b)
		{
			return a;
		}
		return b;
	}
	public static int smallestoftwo(int a,int b)
	{
		if (a<b)
		{
			return a;
		}
		return b;
		
	}
}