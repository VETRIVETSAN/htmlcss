class m2
{
	public static void main(String[]args)
	{
		System.out.println("hi from main");
		dingi("vetri",false);
		System.out.println("bye from main");
	}
	public static void dinga()
	{
		System.out.println("hi from dinga");
		System.out.println("bye from dinga");
			
	}
	public static void dingi(String s,boolean b)
	{
		System.out.println("hi from dingi:"+s);
		dinga();
		System.out.println("bye from dingi:"+b);
	}
}