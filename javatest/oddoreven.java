import java.util.*;
class oddoreven
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)throws Exception
	{
		System.out.println("enter the number");
		int num=sc.nextInt();
		
		
		System.out.println("processing");
		Thread.sleep(2000);

		if (num%2==0)
		{
			System.out.println(num+"is a even");
		}

		else
		{
			System.out.println(num+"is a odd");
		}		
	}
}
