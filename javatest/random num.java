import java.util.Scanner;
class rdnum
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter the number");
		int num=sc.nextInt();

		if (num%2==0)
		{
			if (num%4==0 && num%6==0)
			{
				System.out.println("Vetri");
			}
			else 
			{
				System.out.println("Ammu");

			}
		}
		else
		{
			if (num%3==0  && num%6==0)
			{
				System.out.println("java");

			}

			else
			{
				System.out.println("SQL");

			}
		}
	}
}