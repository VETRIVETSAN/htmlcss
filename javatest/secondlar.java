import java.util.*;
class secondlar
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("enter value of A");
		int a=sc.nextInt();

		System.out.println("enter value of B");
		int b=sc.nextInt();

		System.out.println("enter value of C");
		int c=sc.nextInt();

		if (a>b && a>c)
		{
			if (b>c)
			{
				System.out.println(b+" is second largest");
			}
			else
			{
				System.out.println(c+" is second largest");
			}
		}

		else if (b>c)
		{
			if (a>c)
			{
				System.out.println(a+" is second largest");
			}
			else
			{
				System.out.println(c+" is second largest");
			}
		}
		else
		{
			if (a>b)
			{
				System.out.println(a+" is second largest");
			}
			else 
			{
				System.out.println(b+" is second largest");
			}
		}
	}
}