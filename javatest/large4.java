import java.util.*;
class large4
{
	static Scanner sc=new Scanner(System.in);

	public static void main(String[]args)
	{
		System.out.println("enter the value of A");
		int a=sc.nextInt();

		System.out.println("enter the value of B");
		int b=sc.nextInt();

		System.out.println("enter the value of C");
		int c=sc.nextInt();

		System.out.println("enter the value of D");
		int d=sc.nextInt();


		if (a>b && a>c && a>d)
		{
			if (b>c && b>d)
			{
				if (c>d)
				{
					System.out.println(c+":is a third largest number");

				}
				else
				{
					System.out.println(d+":is a third largest number");
				}				
			}			
		}
		else if (b>c && b>d)
		{
			if (a>c && a>d)
			{ 
				if (c>d)
				{
					System.out.println(c+":is a third largest number");
				}
				else
				{
					System.out.println(d+":is a third largest number");
				}		
			}		
		}
		
		else if (c>d)
		{
			if (a>b && a>d)
			{
				if (b>d)
				{
					System.out.println(b+":is a third largest number");
				}
				else
				{
					System.out.println(d+":is a third largest number");
				}
			}
		}
		else 
		{
			if (a>b & a>c)
			{
				if (b>c)
				{
					System.out.println(b+":is a third largest number");				
				}
				else
				{
					System.out.println(c+"is a third largest number");
				}
			}
		}
			
		


	}
	
}