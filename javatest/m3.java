class m3
{
	public static void main(String[]args)
	{
		System.out.println("hi from main");
		ram(true);
		System.out.println("sing is king");
		ram(false);
		System.out.println("bye from main");
	}
	public static void ram(boolean b)
	{
		System.out.println("hi from ram");
		if (b)
		{
			System.out.println("java");
		}
		else
		{
			System.out.println("sql");
		}
		System.out.println("bye from ram");
	}
}