import java.util.*;
class posneg
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		
		System.out.println("enter the value");
		int number =sc.nextInt();

		if (number>=0)
		{
			System.out.println(number+":is a +ve");
		}

		else
		{
			System.out.println(number+":is a -ve");

		}
	}


}