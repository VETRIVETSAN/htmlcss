class ex6
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		if (ram (4.3,'b'))
		{
			System.out.println("123");
			int res=demo();
			System.out.println(res);
		}
		else
		{
			System.out.println("j 4 job");

		}
			System.out.println("bye from main");
	}
	public static boolean ram(double a, char ch)
	{
		System.out.println("a:"+a);
		System.out.println("ch:"+ch);
		System.out.println("Asci:"+(int)ch);
		demo();
		return true;
	}
	public static int demo()
	{
		System.out.println("hi from demo");
		System.out.println("bye from demo");
		return 5;
	}
}
