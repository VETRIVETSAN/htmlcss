import java.util.*;
class abc
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.println("enter the value of A"); 
		int a=sc.nextInt();

		System.out.println("enter the value of b");
		int b=sc.nextInt();

		System.out.println("enter the value of c");
		int c=sc.nextInt();

		if (a>b && a>c)
		{
			if(b>c)
			{
			System.out.println(b+"is the second largest ");
			}
			
			else
			{
				System.out.println(c+"is the largest");
			}		
		}

		else if(b>c)
		{
			if(c>a)
			{
				System.out.println(c+"is a second largest");
			}
			else
			{
				System.out.println(a+"is a second largest");
			}
		}

		else
		{
			if(a>b)
			{
				System.out.println(a+"is a second largest");
			}
			else
			{
				System.out.println(b+"is a second largest");
					
			}
		}
	}
}




