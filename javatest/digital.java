import java.util.Scanner;
class digital 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter the number");
		int number=sc.nextInt();
		int sum=0;

		while (number >0)
		{
			sum=sum+(number%10);
			number/=10;
		}
		System.out.println("digital sum is:"+sum);
			
	}

}