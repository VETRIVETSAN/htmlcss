import java.util.*;
class task3
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

		if(a>b && a>c)
		{
			if (b>c)
			{
				System.out.println(c+"is the third largest");
			}
			else
			{
				System.out.println(b+"is the third largest");
		

			}		

							
		}
		else if (b>c)
		{
			if (a>c)
			{
				System.out.println(c+"is the third largest");
				
			}
			else
			{
				System.out.println(a+"is the third largest");
			}
		}
		else 
			{
				if (a>b)
				{
					System.out.println(b+"is the third largest");

				}
				else
				{
					System.out.println(a+"is the third largest");
				}
			}
		





		

	}
}
